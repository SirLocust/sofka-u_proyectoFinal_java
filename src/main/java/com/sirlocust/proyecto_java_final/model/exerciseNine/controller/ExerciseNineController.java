package com.sirlocust.proyecto_java_final.model.exerciseNine.controller;

import com.sirlocust.proyecto_java_final.model.exerciseNine.model.ChangeVowelFromText;
import com.sirlocust.proyecto_java_final.model.exerciseNine.view.ExerciseNineDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseNineController {
  ExerciseNineDashboard exerciseNineDashboard;
  ChangeVowelFromText changeVowelFromText;

  public boolean init() {
    while (true) {
      this.exerciseNineDashboard.welcomeMessage();
      this.initClass();
      if (this.exerciseNineDashboard.isBack()) {
        break;
      }
    }
    return true;
  }

  public void initClass() {
    String userInput = this.exerciseNineDashboard.getString("ingrese la frase que quiere concatenar");
    System.out.println(this.changeVowelFromText.concatWords(userInput));
  }
}
