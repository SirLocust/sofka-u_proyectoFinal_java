package com.sirlocust.proyecto_java_final.model.exerciseSeven.controller;

import com.sirlocust.proyecto_java_final.model.exerciseSeven.model.NumberIsGreaterToZero;
import com.sirlocust.proyecto_java_final.model.exerciseSeven.view.ExerciseSevenDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseSevenController {

  ExerciseSevenDashboard exerciseSevenDashboard;
  NumberIsGreaterToZero numberIsGreaterToZero;

  public boolean init() {
    while (true) {
      this.exerciseSevenDashboard.welcomeMessage();

      this.initClass();
      if (this.exerciseSevenDashboard.isBack()) {
        break;
      }

    }
    return true;

  }

  public void initClass() {
    do {

    } while (!this.numberIsGreaterToZero.isGreaterToZero(this.exerciseSevenDashboard.getNumber()));
  }

}
