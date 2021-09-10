package com.sirlocust.proyecto_java_final.model.exerciseFive;

import com.sirlocust.proyecto_java_final.model.exerciseFive.controller.ExerciseFiveController;
import com.sirlocust.proyecto_java_final.model.exerciseFive.model.NumbersOddAndEven;
import com.sirlocust.proyecto_java_final.model.exerciseFive.view.ExerciseFiveDashboard;

public class ExerciseFiveRun {

  public static boolean run() {
    ExerciseFiveDashboard exerciseFiveDashboard = new ExerciseFiveDashboard();
    NumbersOddAndEven numbersOddAndEven = new NumbersOddAndEven();
    ExerciseFiveController exerciseFiveController = new ExerciseFiveController(exerciseFiveDashboard,
        numbersOddAndEven);
    return exerciseFiveController.init();
  }
}
