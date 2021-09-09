package com.sirlocust.proyecto_java_final.model.exerciseEight;

import com.sirlocust.proyecto_java_final.model.exerciseEight.controller.ExerciseEightController;
import com.sirlocust.proyecto_java_final.model.exerciseEight.model.WhichIsDayOfWeek;
import com.sirlocust.proyecto_java_final.model.exerciseEight.view.ExerciseEightDashboard;

public class ExerciseEightRun {

  public boolean run() {
    ExerciseEightDashboard exerciseEightDashboard = new ExerciseEightDashboard();
    WhichIsDayOfWeek whichIsDayOfWeek = new WhichIsDayOfWeek();
    ExerciseEightController exerciseEightController = new ExerciseEightController(exerciseEightDashboard,
        whichIsDayOfWeek);
    return exerciseEightController.init();
  }
}
