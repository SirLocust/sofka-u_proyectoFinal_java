package com.sirlocust.proyecto_java_final.model.exerciseEight.controller;

import com.sirlocust.proyecto_java_final.model.exerciseEight.model.WhichIsDayOfWeek;
import com.sirlocust.proyecto_java_final.model.exerciseEight.view.ExerciseEightDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseEightController {

  ExerciseEightDashboard exerciseEightDashboard;
  WhichIsDayOfWeek wIsDayOfWeek;

  public boolean init() {

    while (true) {
      this.exerciseEightDashboard.welcomeMessage();
      this.initClass();
      if (this.exerciseEightDashboard.isBack()) {
        break;
      }
    }

    return true;
  }

  private void initClass() {
    String userInput = this.exerciseEightDashboard.getString("ingrese un dia de la semana").toLowerCase();
    System.out.println(this.wIsDayOfWeek.isWorkingDay(userInput));
  }
}
