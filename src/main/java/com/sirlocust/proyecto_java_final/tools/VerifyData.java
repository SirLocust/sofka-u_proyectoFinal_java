package com.sirlocust.proyecto_java_final.tools;

public class VerifyData {

  public static boolean isNumber(String data) {
    try {
      Double.parseDouble(data);
      return true;
    } catch (NumberFormatException eFormatException) {
      return false;
    }
  }
}
