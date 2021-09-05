package com.sirlocust.proyecto_java_final.model.exerciseFive.controller;

import com.sirlocust.proyecto_java_final.model.exerciseFive.model.NumbersOddAndEven;
import com.sirlocust.proyecto_java_final.model.exerciseFive.view.ExerciseFiveDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseFiveController {

  ExerciseFiveDashboard exerciseFiveDashboard;
  NumbersOddAndEven numbersOddAndEven;

  public boolean init() {
    while (true) {
      exerciseFiveDashboard.welcomeMessage();
      exerciseFiveDashboard.resultMessage("While", numbersOddAndEven.generateOddAndEvenWhile());
      exerciseFiveDashboard.resultMessage("For", numbersOddAndEven.generateOddAndEvenFor());

      if (exerciseFiveDashboard.isBack()) {
        break;
      }

    }
    return true;
  }

}
