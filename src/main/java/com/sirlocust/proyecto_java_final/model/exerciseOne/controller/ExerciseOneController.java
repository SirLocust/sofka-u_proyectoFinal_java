package com.sirlocust.proyecto_java_final.model.exerciseOne.controller;

import com.sirlocust.proyecto_java_final.model.exerciseOne.model.WhichIsGreater;
import com.sirlocust.proyecto_java_final.model.exerciseOne.view.ExerciseOneDashboard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExerciseOneController {
  ExerciseOneDashboard exerciseOneDashboard;
  WhichIsGreater wIsGreater;

  public boolean init() {
    while (true) {
      exerciseOneDashboard.welcomeMessage();
      initClass();
      wIsGreater.isGreater();
      if (exerciseOneDashboard.isBack()) {

        break;
      }

    }
    return true;
  }

  private void initClass() {
    wIsGreater.setNumberOne(exerciseOneDashboard.getNumber());
    wIsGreater.setNumberTwo(exerciseOneDashboard.getNumber());
  }
}
