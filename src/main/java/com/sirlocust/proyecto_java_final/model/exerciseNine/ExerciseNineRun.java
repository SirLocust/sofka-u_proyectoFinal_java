package com.sirlocust.proyecto_java_final.model.exerciseNine;

import com.sirlocust.proyecto_java_final.model.exerciseNine.controller.ExerciseNineController;
import com.sirlocust.proyecto_java_final.model.exerciseNine.model.ChangeVowelFromText;
import com.sirlocust.proyecto_java_final.model.exerciseNine.view.ExerciseNineDashboard;

public class ExerciseNineRun {
  public static boolean run() {

    ExerciseNineDashboard exerciseNineDashboard = new ExerciseNineDashboard();
    ChangeVowelFromText changeVowelFromText = new ChangeVowelFromText();
    ExerciseNineController exerciseNineController = new ExerciseNineController(exerciseNineDashboard,
        changeVowelFromText);
    return exerciseNineController.init();
  }

}
