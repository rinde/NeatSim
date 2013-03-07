/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package neatsim.server.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CPopulationInfo implements org.apache.thrift.TBase<CPopulationInfo, CPopulationInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CPopulationInfo");

  private static final org.apache.thrift.protocol.TField GENERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("generation", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField PHENOMES_FIELD_DESC = new org.apache.thrift.protocol.TField("phenomes", org.apache.thrift.protocol.TType.LIST, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CPopulationInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CPopulationInfoTupleSchemeFactory());
  }

  public int generation; // required
  public List<CFastCyclicNetwork> phenomes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GENERATION((short)5, "generation"),
    PHENOMES((short)10, "phenomes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 5: // GENERATION
          return GENERATION;
        case 10: // PHENOMES
          return PHENOMES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GENERATION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GENERATION, new org.apache.thrift.meta_data.FieldMetaData("generation", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PHENOMES, new org.apache.thrift.meta_data.FieldMetaData("phenomes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CFastCyclicNetwork.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CPopulationInfo.class, metaDataMap);
  }

  public CPopulationInfo() {
  }

  public CPopulationInfo(
    int generation,
    List<CFastCyclicNetwork> phenomes)
  {
    this();
    this.generation = generation;
    setGenerationIsSet(true);
    this.phenomes = phenomes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CPopulationInfo(CPopulationInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.generation = other.generation;
    if (other.isSetPhenomes()) {
      List<CFastCyclicNetwork> __this__phenomes = new ArrayList<CFastCyclicNetwork>();
      for (CFastCyclicNetwork other_element : other.phenomes) {
        __this__phenomes.add(new CFastCyclicNetwork(other_element));
      }
      this.phenomes = __this__phenomes;
    }
  }

  public CPopulationInfo deepCopy() {
    return new CPopulationInfo(this);
  }

  @Override
  public void clear() {
    setGenerationIsSet(false);
    this.generation = 0;
    this.phenomes = null;
  }

  public int getGeneration() {
    return this.generation;
  }

  public CPopulationInfo setGeneration(int generation) {
    this.generation = generation;
    setGenerationIsSet(true);
    return this;
  }

  public void unsetGeneration() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GENERATION_ISSET_ID);
  }

  /** Returns true if field generation is set (has been assigned a value) and false otherwise */
  public boolean isSetGeneration() {
    return EncodingUtils.testBit(__isset_bitfield, __GENERATION_ISSET_ID);
  }

  public void setGenerationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GENERATION_ISSET_ID, value);
  }

  public int getPhenomesSize() {
    return (this.phenomes == null) ? 0 : this.phenomes.size();
  }

  public java.util.Iterator<CFastCyclicNetwork> getPhenomesIterator() {
    return (this.phenomes == null) ? null : this.phenomes.iterator();
  }

  public void addToPhenomes(CFastCyclicNetwork elem) {
    if (this.phenomes == null) {
      this.phenomes = new ArrayList<CFastCyclicNetwork>();
    }
    this.phenomes.add(elem);
  }

  public List<CFastCyclicNetwork> getPhenomes() {
    return this.phenomes;
  }

  public CPopulationInfo setPhenomes(List<CFastCyclicNetwork> phenomes) {
    this.phenomes = phenomes;
    return this;
  }

  public void unsetPhenomes() {
    this.phenomes = null;
  }

  /** Returns true if field phenomes is set (has been assigned a value) and false otherwise */
  public boolean isSetPhenomes() {
    return this.phenomes != null;
  }

  public void setPhenomesIsSet(boolean value) {
    if (!value) {
      this.phenomes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GENERATION:
      if (value == null) {
        unsetGeneration();
      } else {
        setGeneration((Integer)value);
      }
      break;

    case PHENOMES:
      if (value == null) {
        unsetPhenomes();
      } else {
        setPhenomes((List<CFastCyclicNetwork>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GENERATION:
      return Integer.valueOf(getGeneration());

    case PHENOMES:
      return getPhenomes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GENERATION:
      return isSetGeneration();
    case PHENOMES:
      return isSetPhenomes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CPopulationInfo)
      return this.equals((CPopulationInfo)that);
    return false;
  }

  public boolean equals(CPopulationInfo that) {
    if (that == null)
      return false;

    boolean this_present_generation = true;
    boolean that_present_generation = true;
    if (this_present_generation || that_present_generation) {
      if (!(this_present_generation && that_present_generation))
        return false;
      if (this.generation != that.generation)
        return false;
    }

    boolean this_present_phenomes = true && this.isSetPhenomes();
    boolean that_present_phenomes = true && that.isSetPhenomes();
    if (this_present_phenomes || that_present_phenomes) {
      if (!(this_present_phenomes && that_present_phenomes))
        return false;
      if (!this.phenomes.equals(that.phenomes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CPopulationInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CPopulationInfo typedOther = (CPopulationInfo)other;

    lastComparison = Boolean.valueOf(isSetGeneration()).compareTo(typedOther.isSetGeneration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGeneration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.generation, typedOther.generation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhenomes()).compareTo(typedOther.isSetPhenomes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhenomes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phenomes, typedOther.phenomes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CPopulationInfo(");
    boolean first = true;

    sb.append("generation:");
    sb.append(this.generation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("phenomes:");
    if (this.phenomes == null) {
      sb.append("null");
    } else {
      sb.append(this.phenomes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'generation' because it's a primitive and you chose the non-beans generator.
    if (phenomes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'phenomes' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CPopulationInfoStandardSchemeFactory implements SchemeFactory {
    public CPopulationInfoStandardScheme getScheme() {
      return new CPopulationInfoStandardScheme();
    }
  }

  private static class CPopulationInfoStandardScheme extends StandardScheme<CPopulationInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CPopulationInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 5: // GENERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.generation = iprot.readI32();
              struct.setGenerationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // PHENOMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.phenomes = new ArrayList<CFastCyclicNetwork>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  CFastCyclicNetwork _elem42; // required
                  _elem42 = new CFastCyclicNetwork();
                  _elem42.read(iprot);
                  struct.phenomes.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setPhenomesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetGeneration()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'generation' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CPopulationInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GENERATION_FIELD_DESC);
      oprot.writeI32(struct.generation);
      oprot.writeFieldEnd();
      if (struct.phenomes != null) {
        oprot.writeFieldBegin(PHENOMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.phenomes.size()));
          for (CFastCyclicNetwork _iter43 : struct.phenomes)
          {
            _iter43.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CPopulationInfoTupleSchemeFactory implements SchemeFactory {
    public CPopulationInfoTupleScheme getScheme() {
      return new CPopulationInfoTupleScheme();
    }
  }

  private static class CPopulationInfoTupleScheme extends TupleScheme<CPopulationInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CPopulationInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.generation);
      {
        oprot.writeI32(struct.phenomes.size());
        for (CFastCyclicNetwork _iter44 : struct.phenomes)
        {
          _iter44.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CPopulationInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.generation = iprot.readI32();
      struct.setGenerationIsSet(true);
      {
        org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.phenomes = new ArrayList<CFastCyclicNetwork>(_list45.size);
        for (int _i46 = 0; _i46 < _list45.size; ++_i46)
        {
          CFastCyclicNetwork _elem47; // required
          _elem47 = new CFastCyclicNetwork();
          _elem47.read(iprot);
          struct.phenomes.add(_elem47);
        }
      }
      struct.setPhenomesIsSet(true);
    }
  }

}

