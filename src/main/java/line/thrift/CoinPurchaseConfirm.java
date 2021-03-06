/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-15")
public class CoinPurchaseConfirm implements org.apache.thrift.TBase<CoinPurchaseConfirm, CoinPurchaseConfirm._Fields>, java.io.Serializable, Cloneable, Comparable<CoinPurchaseConfirm> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CoinPurchaseConfirm");

  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField APP_STORE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("appStoreCode", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RECEIPT_FIELD_DESC = new org.apache.thrift.protocol.TField("receipt", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SIGNATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("signature", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SELLER_FIELD_DESC = new org.apache.thrift.protocol.TField("seller", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField REQUEST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("requestType", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField IGNORE_RECEIPT_FIELD_DESC = new org.apache.thrift.protocol.TField("ignoreReceipt", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CoinPurchaseConfirmStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CoinPurchaseConfirmTupleSchemeFactory());
  }

  private String orderId; // required
  private PaymentType appStoreCode; // required
  private String receipt; // required
  private String signature; // required
  private String seller; // required
  private String requestType; // required
  private boolean ignoreReceipt; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_ID((short)1, "orderId"),
    /**
     * 
     * @see PaymentType
     */
    APP_STORE_CODE((short)2, "appStoreCode"),
    RECEIPT((short)3, "receipt"),
    SIGNATURE((short)4, "signature"),
    SELLER((short)5, "seller"),
    REQUEST_TYPE((short)6, "requestType"),
    IGNORE_RECEIPT((short)7, "ignoreReceipt");

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
        case 1: // ORDER_ID
          return ORDER_ID;
        case 2: // APP_STORE_CODE
          return APP_STORE_CODE;
        case 3: // RECEIPT
          return RECEIPT;
        case 4: // SIGNATURE
          return SIGNATURE;
        case 5: // SELLER
          return SELLER;
        case 6: // REQUEST_TYPE
          return REQUEST_TYPE;
        case 7: // IGNORE_RECEIPT
          return IGNORE_RECEIPT;
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
  private static final int __IGNORERECEIPT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_STORE_CODE, new org.apache.thrift.meta_data.FieldMetaData("appStoreCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PaymentType.class)));
    tmpMap.put(_Fields.RECEIPT, new org.apache.thrift.meta_data.FieldMetaData("receipt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SIGNATURE, new org.apache.thrift.meta_data.FieldMetaData("signature", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SELLER, new org.apache.thrift.meta_data.FieldMetaData("seller", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("requestType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IGNORE_RECEIPT, new org.apache.thrift.meta_data.FieldMetaData("ignoreReceipt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CoinPurchaseConfirm.class, metaDataMap);
  }

  public CoinPurchaseConfirm() {
  }

  public CoinPurchaseConfirm(
    String orderId,
    PaymentType appStoreCode,
    String receipt,
    String signature,
    String seller,
    String requestType,
    boolean ignoreReceipt)
  {
    this();
    this.orderId = orderId;
    this.appStoreCode = appStoreCode;
    this.receipt = receipt;
    this.signature = signature;
    this.seller = seller;
    this.requestType = requestType;
    this.ignoreReceipt = ignoreReceipt;
    setIgnoreReceiptIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinPurchaseConfirm(CoinPurchaseConfirm other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOrderId()) {
      this.orderId = other.orderId;
    }
    if (other.isSetAppStoreCode()) {
      this.appStoreCode = other.appStoreCode;
    }
    if (other.isSetReceipt()) {
      this.receipt = other.receipt;
    }
    if (other.isSetSignature()) {
      this.signature = other.signature;
    }
    if (other.isSetSeller()) {
      this.seller = other.seller;
    }
    if (other.isSetRequestType()) {
      this.requestType = other.requestType;
    }
    this.ignoreReceipt = other.ignoreReceipt;
  }

  public CoinPurchaseConfirm deepCopy() {
    return new CoinPurchaseConfirm(this);
  }

  @Override
  public void clear() {
    this.orderId = null;
    this.appStoreCode = null;
    this.receipt = null;
    this.signature = null;
    this.seller = null;
    this.requestType = null;
    setIgnoreReceiptIsSet(false);
    this.ignoreReceipt = false;
  }

  public String getOrderId() {
    return this.orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public void unsetOrderId() {
    this.orderId = null;
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return this.orderId != null;
  }

  public void setOrderIdIsSet(boolean value) {
    if (!value) {
      this.orderId = null;
    }
  }

  /**
   * 
   * @see PaymentType
   */
  public PaymentType getAppStoreCode() {
    return this.appStoreCode;
  }

  /**
   * 
   * @see PaymentType
   */
  public void setAppStoreCode(PaymentType appStoreCode) {
    this.appStoreCode = appStoreCode;
  }

  public void unsetAppStoreCode() {
    this.appStoreCode = null;
  }

  /** Returns true if field appStoreCode is set (has been assigned a value) and false otherwise */
  public boolean isSetAppStoreCode() {
    return this.appStoreCode != null;
  }

  public void setAppStoreCodeIsSet(boolean value) {
    if (!value) {
      this.appStoreCode = null;
    }
  }

  public String getReceipt() {
    return this.receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  public void unsetReceipt() {
    this.receipt = null;
  }

  /** Returns true if field receipt is set (has been assigned a value) and false otherwise */
  public boolean isSetReceipt() {
    return this.receipt != null;
  }

  public void setReceiptIsSet(boolean value) {
    if (!value) {
      this.receipt = null;
    }
  }

  public String getSignature() {
    return this.signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public void unsetSignature() {
    this.signature = null;
  }

  /** Returns true if field signature is set (has been assigned a value) and false otherwise */
  public boolean isSetSignature() {
    return this.signature != null;
  }

  public void setSignatureIsSet(boolean value) {
    if (!value) {
      this.signature = null;
    }
  }

  public String getSeller() {
    return this.seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public void unsetSeller() {
    this.seller = null;
  }

  /** Returns true if field seller is set (has been assigned a value) and false otherwise */
  public boolean isSetSeller() {
    return this.seller != null;
  }

  public void setSellerIsSet(boolean value) {
    if (!value) {
      this.seller = null;
    }
  }

  public String getRequestType() {
    return this.requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public void unsetRequestType() {
    this.requestType = null;
  }

  /** Returns true if field requestType is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestType() {
    return this.requestType != null;
  }

  public void setRequestTypeIsSet(boolean value) {
    if (!value) {
      this.requestType = null;
    }
  }

  public boolean isIgnoreReceipt() {
    return this.ignoreReceipt;
  }

  public void setIgnoreReceipt(boolean ignoreReceipt) {
    this.ignoreReceipt = ignoreReceipt;
    setIgnoreReceiptIsSet(true);
  }

  public void unsetIgnoreReceipt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IGNORERECEIPT_ISSET_ID);
  }

  /** Returns true if field ignoreReceipt is set (has been assigned a value) and false otherwise */
  public boolean isSetIgnoreReceipt() {
    return EncodingUtils.testBit(__isset_bitfield, __IGNORERECEIPT_ISSET_ID);
  }

  public void setIgnoreReceiptIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IGNORERECEIPT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((String)value);
      }
      break;

    case APP_STORE_CODE:
      if (value == null) {
        unsetAppStoreCode();
      } else {
        setAppStoreCode((PaymentType)value);
      }
      break;

    case RECEIPT:
      if (value == null) {
        unsetReceipt();
      } else {
        setReceipt((String)value);
      }
      break;

    case SIGNATURE:
      if (value == null) {
        unsetSignature();
      } else {
        setSignature((String)value);
      }
      break;

    case SELLER:
      if (value == null) {
        unsetSeller();
      } else {
        setSeller((String)value);
      }
      break;

    case REQUEST_TYPE:
      if (value == null) {
        unsetRequestType();
      } else {
        setRequestType((String)value);
      }
      break;

    case IGNORE_RECEIPT:
      if (value == null) {
        unsetIgnoreReceipt();
      } else {
        setIgnoreReceipt((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_ID:
      return getOrderId();

    case APP_STORE_CODE:
      return getAppStoreCode();

    case RECEIPT:
      return getReceipt();

    case SIGNATURE:
      return getSignature();

    case SELLER:
      return getSeller();

    case REQUEST_TYPE:
      return getRequestType();

    case IGNORE_RECEIPT:
      return isIgnoreReceipt();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDER_ID:
      return isSetOrderId();
    case APP_STORE_CODE:
      return isSetAppStoreCode();
    case RECEIPT:
      return isSetReceipt();
    case SIGNATURE:
      return isSetSignature();
    case SELLER:
      return isSetSeller();
    case REQUEST_TYPE:
      return isSetRequestType();
    case IGNORE_RECEIPT:
      return isSetIgnoreReceipt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinPurchaseConfirm)
      return this.equals((CoinPurchaseConfirm)that);
    return false;
  }

  public boolean equals(CoinPurchaseConfirm that) {
    if (that == null)
      return false;

    boolean this_present_orderId = true && this.isSetOrderId();
    boolean that_present_orderId = true && that.isSetOrderId();
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (!this.orderId.equals(that.orderId))
        return false;
    }

    boolean this_present_appStoreCode = true && this.isSetAppStoreCode();
    boolean that_present_appStoreCode = true && that.isSetAppStoreCode();
    if (this_present_appStoreCode || that_present_appStoreCode) {
      if (!(this_present_appStoreCode && that_present_appStoreCode))
        return false;
      if (!this.appStoreCode.equals(that.appStoreCode))
        return false;
    }

    boolean this_present_receipt = true && this.isSetReceipt();
    boolean that_present_receipt = true && that.isSetReceipt();
    if (this_present_receipt || that_present_receipt) {
      if (!(this_present_receipt && that_present_receipt))
        return false;
      if (!this.receipt.equals(that.receipt))
        return false;
    }

    boolean this_present_signature = true && this.isSetSignature();
    boolean that_present_signature = true && that.isSetSignature();
    if (this_present_signature || that_present_signature) {
      if (!(this_present_signature && that_present_signature))
        return false;
      if (!this.signature.equals(that.signature))
        return false;
    }

    boolean this_present_seller = true && this.isSetSeller();
    boolean that_present_seller = true && that.isSetSeller();
    if (this_present_seller || that_present_seller) {
      if (!(this_present_seller && that_present_seller))
        return false;
      if (!this.seller.equals(that.seller))
        return false;
    }

    boolean this_present_requestType = true && this.isSetRequestType();
    boolean that_present_requestType = true && that.isSetRequestType();
    if (this_present_requestType || that_present_requestType) {
      if (!(this_present_requestType && that_present_requestType))
        return false;
      if (!this.requestType.equals(that.requestType))
        return false;
    }

    boolean this_present_ignoreReceipt = true;
    boolean that_present_ignoreReceipt = true;
    if (this_present_ignoreReceipt || that_present_ignoreReceipt) {
      if (!(this_present_ignoreReceipt && that_present_ignoreReceipt))
        return false;
      if (this.ignoreReceipt != that.ignoreReceipt)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_orderId = true && (isSetOrderId());
    list.add(present_orderId);
    if (present_orderId)
      list.add(orderId);

    boolean present_appStoreCode = true && (isSetAppStoreCode());
    list.add(present_appStoreCode);
    if (present_appStoreCode)
      list.add(appStoreCode.getValue());

    boolean present_receipt = true && (isSetReceipt());
    list.add(present_receipt);
    if (present_receipt)
      list.add(receipt);

    boolean present_signature = true && (isSetSignature());
    list.add(present_signature);
    if (present_signature)
      list.add(signature);

    boolean present_seller = true && (isSetSeller());
    list.add(present_seller);
    if (present_seller)
      list.add(seller);

    boolean present_requestType = true && (isSetRequestType());
    list.add(present_requestType);
    if (present_requestType)
      list.add(requestType);

    boolean present_ignoreReceipt = true;
    list.add(present_ignoreReceipt);
    if (present_ignoreReceipt)
      list.add(ignoreReceipt);

    return list.hashCode();
  }

  @Override
  public int compareTo(CoinPurchaseConfirm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppStoreCode()).compareTo(other.isSetAppStoreCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppStoreCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appStoreCode, other.appStoreCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceipt()).compareTo(other.isSetReceipt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceipt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receipt, other.receipt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSignature()).compareTo(other.isSetSignature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignature()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.signature, other.signature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeller()).compareTo(other.isSetSeller());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeller()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seller, other.seller);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestType()).compareTo(other.isSetRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestType, other.requestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIgnoreReceipt()).compareTo(other.isSetIgnoreReceipt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIgnoreReceipt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ignoreReceipt, other.ignoreReceipt);
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
    StringBuilder sb = new StringBuilder("CoinPurchaseConfirm(");
    boolean first = true;

    sb.append("orderId:");
    if (this.orderId == null) {
      sb.append("null");
    } else {
      sb.append(this.orderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appStoreCode:");
    if (this.appStoreCode == null) {
      sb.append("null");
    } else {
      sb.append(this.appStoreCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receipt:");
    if (this.receipt == null) {
      sb.append("null");
    } else {
      sb.append(this.receipt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("signature:");
    if (this.signature == null) {
      sb.append("null");
    } else {
      sb.append(this.signature);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("seller:");
    if (this.seller == null) {
      sb.append("null");
    } else {
      sb.append(this.seller);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestType:");
    if (this.requestType == null) {
      sb.append("null");
    } else {
      sb.append(this.requestType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ignoreReceipt:");
    sb.append(this.ignoreReceipt);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class CoinPurchaseConfirmStandardSchemeFactory implements SchemeFactory {
    public CoinPurchaseConfirmStandardScheme getScheme() {
      return new CoinPurchaseConfirmStandardScheme();
    }
  }

  private static class CoinPurchaseConfirmStandardScheme extends StandardScheme<CoinPurchaseConfirm> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CoinPurchaseConfirm struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orderId = iprot.readString();
              struct.setOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_STORE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appStoreCode = line.thrift.PaymentType.findByValue(iprot.readI32());
              struct.setAppStoreCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECEIPT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receipt = iprot.readString();
              struct.setReceiptIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SIGNATURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.signature = iprot.readString();
              struct.setSignatureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SELLER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.seller = iprot.readString();
              struct.setSellerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REQUEST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestType = iprot.readString();
              struct.setRequestTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // IGNORE_RECEIPT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ignoreReceipt = iprot.readBool();
              struct.setIgnoreReceiptIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CoinPurchaseConfirm struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orderId != null) {
        oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
        oprot.writeString(struct.orderId);
        oprot.writeFieldEnd();
      }
      if (struct.appStoreCode != null) {
        oprot.writeFieldBegin(APP_STORE_CODE_FIELD_DESC);
        oprot.writeI32(struct.appStoreCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.receipt != null) {
        oprot.writeFieldBegin(RECEIPT_FIELD_DESC);
        oprot.writeString(struct.receipt);
        oprot.writeFieldEnd();
      }
      if (struct.signature != null) {
        oprot.writeFieldBegin(SIGNATURE_FIELD_DESC);
        oprot.writeString(struct.signature);
        oprot.writeFieldEnd();
      }
      if (struct.seller != null) {
        oprot.writeFieldBegin(SELLER_FIELD_DESC);
        oprot.writeString(struct.seller);
        oprot.writeFieldEnd();
      }
      if (struct.requestType != null) {
        oprot.writeFieldBegin(REQUEST_TYPE_FIELD_DESC);
        oprot.writeString(struct.requestType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IGNORE_RECEIPT_FIELD_DESC);
      oprot.writeBool(struct.ignoreReceipt);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CoinPurchaseConfirmTupleSchemeFactory implements SchemeFactory {
    public CoinPurchaseConfirmTupleScheme getScheme() {
      return new CoinPurchaseConfirmTupleScheme();
    }
  }

  private static class CoinPurchaseConfirmTupleScheme extends TupleScheme<CoinPurchaseConfirm> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CoinPurchaseConfirm struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrderId()) {
        optionals.set(0);
      }
      if (struct.isSetAppStoreCode()) {
        optionals.set(1);
      }
      if (struct.isSetReceipt()) {
        optionals.set(2);
      }
      if (struct.isSetSignature()) {
        optionals.set(3);
      }
      if (struct.isSetSeller()) {
        optionals.set(4);
      }
      if (struct.isSetRequestType()) {
        optionals.set(5);
      }
      if (struct.isSetIgnoreReceipt()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetOrderId()) {
        oprot.writeString(struct.orderId);
      }
      if (struct.isSetAppStoreCode()) {
        oprot.writeI32(struct.appStoreCode.getValue());
      }
      if (struct.isSetReceipt()) {
        oprot.writeString(struct.receipt);
      }
      if (struct.isSetSignature()) {
        oprot.writeString(struct.signature);
      }
      if (struct.isSetSeller()) {
        oprot.writeString(struct.seller);
      }
      if (struct.isSetRequestType()) {
        oprot.writeString(struct.requestType);
      }
      if (struct.isSetIgnoreReceipt()) {
        oprot.writeBool(struct.ignoreReceipt);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CoinPurchaseConfirm struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.orderId = iprot.readString();
        struct.setOrderIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.appStoreCode = line.thrift.PaymentType.findByValue(iprot.readI32());
        struct.setAppStoreCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.receipt = iprot.readString();
        struct.setReceiptIsSet(true);
      }
      if (incoming.get(3)) {
        struct.signature = iprot.readString();
        struct.setSignatureIsSet(true);
      }
      if (incoming.get(4)) {
        struct.seller = iprot.readString();
        struct.setSellerIsSet(true);
      }
      if (incoming.get(5)) {
        struct.requestType = iprot.readString();
        struct.setRequestTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.ignoreReceipt = iprot.readBool();
        struct.setIgnoreReceiptIsSet(true);
      }
    }
  }

}

