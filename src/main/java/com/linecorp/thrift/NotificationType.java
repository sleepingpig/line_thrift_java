/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linecorp.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum NotificationType implements org.apache.thrift.TEnum {
  APPLE_APNS(1),
  GOOGLE_C2DM(2),
  NHN_NNI(3),
  SKT_AOM(4),
  MS_MPNS(5),
  RIM_BIS(6),
  GOOGLE_GCM(7),
  NOKIA_NNAPI(8),
  TIZEN(9),
  LINE_BOT(17),
  LINE_WAP(18);

  private final int value;

  private NotificationType(int value) {
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
  public static NotificationType findByValue(int value) { 
    switch (value) {
      case 1:
        return APPLE_APNS;
      case 2:
        return GOOGLE_C2DM;
      case 3:
        return NHN_NNI;
      case 4:
        return SKT_AOM;
      case 5:
        return MS_MPNS;
      case 6:
        return RIM_BIS;
      case 7:
        return GOOGLE_GCM;
      case 8:
        return NOKIA_NNAPI;
      case 9:
        return TIZEN;
      case 17:
        return LINE_BOT;
      case 18:
        return LINE_WAP;
      default:
        return null;
    }
  }
}