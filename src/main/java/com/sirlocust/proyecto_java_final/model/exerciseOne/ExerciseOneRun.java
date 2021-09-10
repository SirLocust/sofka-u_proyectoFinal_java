package com.sirlocust.proyecto_java_final.model.exerciseOne;

import com.sirlocust.proyecto_java_final.model.exerciseOne.controller.ExerciseOneController;
import com.sirlocust.proyecto_java_final.model.exerciseOne.model.WhichIsGreater;
import com.sirlocust.proyecto_java_final.model.exerciseOne.view.ExerciseOneDashboard;

public class ExerciseOneRun {
  public static boolean run() {
    ExerciseOneDashboard exerciseOneDashboard = new ExerciseOneDashboard();
    WhichIsGreater whichIsGreater = new WhichIsGreater();
    ExerciseOneController exerciseOneController = new ExerciseOneController(exerciseOneDashboard, whichIsGreater);
    return exerciseOneController.init();
  }

}
