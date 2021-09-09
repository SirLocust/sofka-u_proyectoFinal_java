package com.sirlocust.proyecto_java_final.model.exerciseSeven;

import com.sirlocust.proyecto_java_final.model.exerciseSeven.controller.ExerciseSevenController;
import com.sirlocust.proyecto_java_final.model.exerciseSeven.model.NumberIsGreaterToZero;
import com.sirlocust.proyecto_java_final.model.exerciseSeven.view.ExerciseSevenDashboard;

public class ExerciseSevenRun {
  public boolean run() {
    ExerciseSevenDashboard exerciseSevenDashboard = new ExerciseSevenDashboard();
    NumberIsGreaterToZero numberIsGreaterToZero = new NumberIsGreaterToZero();
    ExerciseSevenController exerciseSevenController = new ExerciseSevenController(exerciseSevenDashboard,
        numberIsGreaterToZero);
    return exerciseSevenController.init();
  }
}
