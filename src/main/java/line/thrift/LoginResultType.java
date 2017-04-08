/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package line.thrift;


public enum LoginResultType implements org.apache.thrift.TEnum {
  SUCCESS(1),
  REQUIRE_QRCODE(2),
  REQUIRE_DEVICE_CONFIRM(3);

  private final int value;

  private LoginResultType(int value) {
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
  public static LoginResultType findByValue(int value) { 
    switch (value) {
      case 1:
        return SUCCESS;
      case 2:
        return REQUIRE_QRCODE;
      case 3:
        return REQUIRE_DEVICE_CONFIRM;
      default:
        return null;
    }
  }
}