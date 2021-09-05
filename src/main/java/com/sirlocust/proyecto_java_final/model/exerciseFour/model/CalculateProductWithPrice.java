package com.sirlocust.proyecto_java_final.model.exerciseFour.model;

import lombok.Data;

@Data
public class CalculateProductWithPrice {
  private Double productPrice;

  public String calculatePriceWithIva() {
    Double result = this.productPrice * 1.21;
    return String.format("el valor de producto %.2f con IVA es igual a %.2f", this.productPrice, result);
  }
}
