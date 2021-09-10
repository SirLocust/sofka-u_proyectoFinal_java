package com.sirlocust.proyecto_java_final.model.exerciseEleven.controller;

import com.sirlocust.proyecto_java_final.model.exerciseEleven.model.WhatIsLong;
import com.sirlocust.proyecto_java_final.model.exerciseEleven.view.ExerciseElevenDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseElevenController {
  ExerciseElevenDashboard exerciseElevenDashboard;
  WhatIsLong whatIsLong;

  public boolean init() {
    while (true) {
      this.exerciseElevenDashboard.welcomeMessage();
      this.initClass();
      if (this.exerciseElevenDashboard.isBack()) {
        break;
      }

    }
    return true;
  }

  public void initClass() {
    String userInput = this.exerciseElevenDashboard.getString("ingrese la frase");
    System.out.println(this.whatIsLong.longAndVowelCount(userInput));

  }
}
