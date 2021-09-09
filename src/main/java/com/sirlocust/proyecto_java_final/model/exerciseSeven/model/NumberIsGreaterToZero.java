package com.sirlocust.proyecto_java_final.model.exerciseSeven.model;

public class NumberIsGreaterToZero {

  public boolean isGreaterToZero(double number) {
    if (number < 0) {

      System.out.println("el numero ingresado no es mayor a 0");
      return false;
    }
    System.out.printf("el numero %s es mayor a cero \n", number);
    return true;

  }
}
