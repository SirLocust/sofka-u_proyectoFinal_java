package com.sirlocust.proyecto_java_final.model.exerciseEighteen;

import com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.Serie;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.VideoJuego;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.controller.ExerciseEighteenController;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.view.ExerciseEighteenDashboard;

public class ExerciseEighteenRun {
  public boolean run() {
    ExerciseEighteenDashboard exerciseEighteenDashboard = new ExerciseEighteenDashboard();
    ExerciseEighteenController exerciseEighteenController = new ExerciseEighteenController(exerciseEighteenDashboard);
    return exerciseEighteenController.init();
  }

}
