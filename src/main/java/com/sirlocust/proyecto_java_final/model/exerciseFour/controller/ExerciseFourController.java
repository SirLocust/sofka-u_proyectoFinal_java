package com.sirlocust.proyecto_java_final.model.exerciseFour.controller;

import com.sirlocust.proyecto_java_final.model.exerciseFour.model.CalculateProductWithPrice;
import com.sirlocust.proyecto_java_final.model.exerciseFour.view.ExerciseFourDashboard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExerciseFourController {

  ExerciseFourDashboard exerciseFourDashboard;
  CalculateProductWithPrice calculateProductWithPrice;

  public boolean init() {
    while (true) {
      this.exerciseFourDashboard.welcomeMessage();
      initClass();
      if (this.exerciseFourDashboard.isBack()) {

        break;
      }

    }
    return true;

  }

  public void initClass() {
    this.calculateProductWithPrice.setProductPrice(this.exerciseFourDashboard.getNumber());
    System.out.println(this.calculateProductWithPrice.calculatePriceWithIva());

  }

}
