package com.sirlocust.proyecto_java_final.model.exerciseSeven.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberIsGreaterToZeroTest {
  @Test
  @DisplayName("retorna true si el numero es mayor a cero ")
  void should_return_True() {
    NumberIsGreaterToZero numberIsGreaterToZero = new NumberIsGreaterToZero();
    assertEquals(true, numberIsGreaterToZero.isGreaterToZero(10.0));

  }

  @Test
  @DisplayName("retorna false si el numero es menor a cero ")
  void should_return_False() {
    NumberIsGreaterToZero numberIsGreaterToZero = new NumberIsGreaterToZero();
    assertEquals(false, numberIsGreaterToZero.isGreaterToZero(-30.0));

  }
}
