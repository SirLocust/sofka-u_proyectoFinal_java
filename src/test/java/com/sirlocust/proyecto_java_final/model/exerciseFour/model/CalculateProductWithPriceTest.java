package com.sirlocust.proyecto_java_final.model.exerciseFour.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateProductWithPriceTest {
  @Test
  @DisplayName("devuelve el precio con iva ")
  void should_return_price_white_21_IVA() {
    CalculateProductWithPrice calculateProductWithPrice = new CalculateProductWithPrice();
    calculateProductWithPrice.setProductPrice(134_000.30);
    assertEquals("el valor de producto 134000,30 con IVA es igual a 162140,36",
        calculateProductWithPrice.calculatePriceWithIva());
  }
}
