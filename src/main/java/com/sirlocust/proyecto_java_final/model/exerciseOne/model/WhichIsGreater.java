package com.sirlocust.proyecto_java_final.model.exerciseOne.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhichIsGreater {
  Double numberOne;
  Double numberTwo;

  public void isGreater() {
    if (numberOne.equals(numberTwo)) {
      System.out.printf("\n%.1f es igual que %.1f \n", numberOne, numberTwo);
    }
    if (numberOne > numberTwo) {
      System.out.printf("\n%.1f es mayor que %.1f \n", numberOne, numberTwo);

    }
    if (numberTwo > numberOne) {
      System.out.printf("\n%.1f es mayor que %.1f \n", numberTwo, numberOne);
    }

  }
}
