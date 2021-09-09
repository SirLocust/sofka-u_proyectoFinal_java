package com.sirlocust.proyecto_java_final.model.exerciseTen.controller;

import com.sirlocust.proyecto_java_final.model.exerciseTen.model.RemoveSpacesFromPhrase;
import com.sirlocust.proyecto_java_final.model.exerciseTen.view.ExerciseTenDashboard;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExerciseTenController {

  ExerciseTenDashboard exerciseTenDashboard;
  RemoveSpacesFromPhrase removeSpacesFromPhrase;

  public boolean init() {
    while (true) {
      this.exerciseTenDashboard.welcomeMessage();
      this.initClass();
      if (this.exerciseTenDashboard.isBack()) {
        break;
      }
    }
    return true;

  }

  public void initClass() {
    String userInput = this.exerciseTenDashboard.getString("ingrese la frase ala que le quiere quitar los espacios");
    System.out.println(this.removeSpacesFromPhrase.removeSpace(userInput));
  }
}
