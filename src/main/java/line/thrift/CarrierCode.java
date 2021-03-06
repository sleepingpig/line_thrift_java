/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CarrierCode implements org.apache.thrift.TEnum {
  NOT_SPECIFIED(0),
  JP_DOCOMO(1),
  JP_AU(2),
  JP_SOFTBANK(3),
  KR_SKT(17),
  KR_KT(18),
  KR_LGT(19);

  private final int value;

  private CarrierCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CarrierCode findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_SPECIFIED;
      case 1:
        return JP_DOCOMO;
      case 2:
        return JP_AU;
      case 3:
        return JP_SOFTBANK;
      case 17:
        return KR_SKT;
      case 18:
        return KR_KT;
      case 19:
        return KR_LGT;
      default:
        return null;
    }
  }
}
