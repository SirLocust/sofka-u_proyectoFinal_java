package com.sirlocust.proyecto_java_final.model.exerciseEleven;

import com.sirlocust.proyecto_java_final.model.exerciseEleven.controller.ExerciseElevenController;
import com.sirlocust.proyecto_java_final.model.exerciseEleven.model.WhatIsLong;
import com.sirlocust.proyecto_java_final.model.exerciseEleven.view.ExerciseElevenDashboard;

public class ExerciseElevenRun {

  public boolean run() {
    ExerciseElevenDashboard exerciseElevenDashboard = new ExerciseElevenDashboard();
    WhatIsLong whatIsLong = new WhatIsLong();
    ExerciseElevenController exerciseElevenController = new ExerciseElevenController(exerciseElevenDashboard,
        whatIsLong);
    return exerciseElevenController.init();
  }
}
