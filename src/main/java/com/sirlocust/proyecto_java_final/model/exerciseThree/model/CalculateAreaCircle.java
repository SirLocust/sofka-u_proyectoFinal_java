package com.sirlocust.proyecto_java_final.model.exerciseThree.model;

import lombok.Data;

@Data
public class CalculateAreaCircle {
  Double radius;
  Double pi = Math.PI;

  public String calculateArea() {
    Double area = this.pi * Math.pow(radius, 2);
    return String.format("el Area del circulo con radio de %.2f es igual a %.2f", this.radius, area);
  }
}
