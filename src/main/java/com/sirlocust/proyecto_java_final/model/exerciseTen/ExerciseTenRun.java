package com.sirlocust.proyecto_java_final.model.exerciseTen;

import com.sirlocust.proyecto_java_final.model.exerciseTen.controller.ExerciseTenController;
import com.sirlocust.proyecto_java_final.model.exerciseTen.model.RemoveSpacesFromPhrase;
import com.sirlocust.proyecto_java_final.model.exerciseTen.view.ExerciseTenDashboard;

public class ExerciseTenRun {

  public static boolean run() {

    ExerciseTenDashboard exerciseTenDashboard = new ExerciseTenDashboard();
    RemoveSpacesFromPhrase removeSpacesFromPhrase = new RemoveSpacesFromPhrase();
    ExerciseTenController exerciseTenController = new ExerciseTenController(exerciseTenDashboard,
        removeSpacesFromPhrase);
    return exerciseTenController.init();
  }

}
