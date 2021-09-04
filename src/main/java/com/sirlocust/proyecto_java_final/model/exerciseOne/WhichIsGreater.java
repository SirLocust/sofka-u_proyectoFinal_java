package com.sirlocust.proyecto_java_final.model.exerciseOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WhichIsGreater {
  Double numberOne;
  Double numberTwo;

  public void isGreater() {
    if (numberOne.equals(numberTwo)) {
      System.out.printf("%.1f es igual que %.1f", numberOne, numberTwo);
    }
    if (numberOne > numberTwo) {
      System.out.printf("%.1f es mayor que %.1f", numberOne, numberTwo);

    }
    if (numberTwo > numberOne) {
      System.out.printf("%.1f es mayor que %.1f", numberTwo, numberOne);
    }

  }
}
