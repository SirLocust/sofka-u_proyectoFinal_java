package com.sirlocust.proyecto_java_final.model.exerciseOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WhichIsGreater {
  Double numberOne;
  Double numberTwo;

  public void isGreater() {
    if (numberOne == numberTwo) {
      System.out.printf("%f es igual %f", numberOne, numberTwo);
    }
    if (numberOne > numberTwo) {
      System.out.printf("%f es mayor que %f", numberOne, numberTwo);

    } else {
      System.out.printf("%f es igual %f", numberTwo, numberOne);

    }

  }
}
