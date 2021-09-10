package com.sirlocust.proyecto_java_final.model.exerciseThree;

import com.sirlocust.proyecto_java_final.model.exerciseThree.controller.ExerciseThreeController;
import com.sirlocust.proyecto_java_final.model.exerciseThree.model.CalculateAreaCircle;
import com.sirlocust.proyecto_java_final.model.exerciseThree.view.ExerciseThreeDashboard;

public class ExerciseThreeRun {
  public static boolean run() {

    ExerciseThreeDashboard exerciseThreeDashboard = new ExerciseThreeDashboard();
    CalculateAreaCircle calculateAreaCircle = new CalculateAreaCircle();
    ExerciseThreeController exerciseThreeController = new ExerciseThreeController(exerciseThreeDashboard,
        calculateAreaCircle);
    return exerciseThreeController.init();
  }

}
