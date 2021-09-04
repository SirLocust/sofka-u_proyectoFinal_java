package com.sirlocust.proyecto_java_final.model.exerciseOne.view;

import java.util.Scanner;

import com.sirlocust.proyecto_java_final.tools.VerifyData;
import com.sirlocust.proyecto_java_final.view.Dashborad;

public class ExerciseOneDashboard extends Dashborad {

  public ExerciseOneDashboard() {
    super();
  }

  @Override
  public String readLine() {
    return super.readLine();
  }

  public void welcomeMessage() {
    System.out.println(" __  _    __  _        _    _   _    _______ ___      ______      _     __ _   ___ ___  ");
    System.out
        .println("/ /`| | |/ /\\| |      | |\\ | | | |\\/| |_| |_/ / \\    | |_( (`    | |\\/|/ /\\ \\_/ / | |_) ");
    System.out
        .println("\\_\\_\\_\\_/_/--|_|__    |_| \\\\_\\_|_|  |_|_|_| \\_\\_/    |_|__)_)    |_|  /_/--|_|\\_\\_|_| \\");

  }

  @Override
  public Double getNumber() {

    return super.getNumber();
  }

  @Override
  public boolean isBack() {
    return super.isBack();
  }

}
