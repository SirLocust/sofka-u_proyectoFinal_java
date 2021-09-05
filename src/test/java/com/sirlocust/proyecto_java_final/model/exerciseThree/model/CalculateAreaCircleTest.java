package com.sirlocust.proyecto_java_final.model.exerciseThree.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateAreaCircleTest {
  @Test
  @DisplayName("funcion que retornar el area de un circulo apartir de su radio")
  void testCalculateArea() {
    CalculateAreaCircle cAreaCircle = new CalculateAreaCircle();
    cAreaCircle.setRadius(300.20);
    assertEquals("el Area del circulo con radio de 300,20 es igual a 283120,46", cAreaCircle.calculateArea());

  }
}
