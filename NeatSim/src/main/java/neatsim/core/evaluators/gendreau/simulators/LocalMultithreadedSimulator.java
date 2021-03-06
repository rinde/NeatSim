package neatsim.core.evaluators.gendreau.simulators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import neatsim.util.AssertionHelper;

import org.jppf.task.storage.DataProvider;

import rinde.evo4mas.common.ResultDTO;

/**
 * {@see Simulator} that executes simulation tasks locally in parallel using a
 * number of threads equal to the number of available cores on the local machine.
 *
 * TODO Is not currently deterministic - fix.
 *
 * @author Jonathan Merlevede
 *
 */
public class LocalMultithreadedSimulator implements Simulator {
	protected DataProvider dataProvider;

	@Override
	public Collection<ResultDTO> process(
			final Collection<GendreauSimulationTask> tasks) {
		assert AssertionHelper.isEffectiveCollection(tasks);
		assert dataProvider != null; // users need to call setDataProvider first

		final int threads = Runtime.getRuntime().availableProcessors();
		//final int threads = 1;
		final ExecutorService service = Executors.newFixedThreadPool(threads);
		final List<Callable<ResultDTO>> callables = new ArrayList<>(
				tasks.size());

		int tasknumber = 0;
		System.out.println(tasks.size());
		for (final GendreauSimulationTask task : tasks) {
			tasknumber = tasknumber + 1;
			final int t = tasknumber;
			final Callable<ResultDTO> callable = new Callable<ResultDTO>() {
				@Override
				public ResultDTO call() throws Exception {
					if (t == 1) {

					}
					task.setDataProvider(dataProvider);
					task.run();
					return task.getComputationResult();
				}
			};
			callables.add(callable);
		}
		try {
			final List<Future<ResultDTO>> futures =
					service.invokeAll(callables);
			service.shutdown();
			assert futures.size() == tasks.size();
			final List<ResultDTO> fitnessInfos =
					new ArrayList<>(futures.size());
			for (final Future<ResultDTO> future : futures) {
				fitnessInfos.add(future.get());
			}

			assert tasks.size() == fitnessInfos.size();
			assert AssertionHelper.isEffectiveCollection(fitnessInfos);
			return fitnessInfos;
		} catch (final ExecutionException e) {
			e.printStackTrace();
			throw new RuntimeException("Exception in execution of tasks: " + e);
		} catch (final InterruptedException e) {
			throw new RuntimeException("Interrupted: " + e);
		}
	}

	@Override
	public void setDataProvider(final DataProvider dataProvider) {
		assert dataProvider != null;
		this.dataProvider = dataProvider;
	}
}