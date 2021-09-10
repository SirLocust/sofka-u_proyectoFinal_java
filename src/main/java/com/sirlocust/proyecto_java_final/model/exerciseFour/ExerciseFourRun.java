package com.sirlocust.proyecto_java_final.model.exerciseFour;

import com.sirlocust.proyecto_java_final.model.exerciseFour.controller.ExerciseFourController;
import com.sirlocust.proyecto_java_final.model.exerciseFour.model.CalculateProductWithPrice;
import com.sirlocust.proyecto_java_final.model.exerciseFour.view.ExerciseFourDashboard;

public class ExerciseFourRun {
  public static boolean run() {
    ExerciseFourDashboard exerciseFourDashboard = new ExerciseFourDashboard();
    CalculateProductWithPrice calculateProductWithPrice = new CalculateProductWithPrice();
    ExerciseFourController exerciseFourController = new ExerciseFourController(exerciseFourDashboard,
        calculateProductWithPrice);

    return exerciseFourController.init();
  }
}
