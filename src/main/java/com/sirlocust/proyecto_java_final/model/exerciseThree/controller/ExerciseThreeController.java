package com.sirlocust.proyecto_java_final.model.exerciseThree.controller;

import com.sirlocust.proyecto_java_final.model.exerciseThree.model.CalculateAreaCircle;
import com.sirlocust.proyecto_java_final.model.exerciseThree.view.ExerciseThreeDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseThreeController {
  ExerciseThreeDashboard exerciseThreeDashboard;
  CalculateAreaCircle calculateAreaCircle;

  public boolean init() {
    this.exerciseThreeDashboard.welcomeMessage();
    this.initClass();
    while (true) {
      if (this.exerciseThreeDashboard.isBack()) {
        break;
      }

    }
    return true;
  }

  public void initClass() {
    this.calculateAreaCircle.setRadius(this.exerciseThreeDashboard.getNumber());
    System.out.println(this.calculateAreaCircle.calculateArea());

  }
}
