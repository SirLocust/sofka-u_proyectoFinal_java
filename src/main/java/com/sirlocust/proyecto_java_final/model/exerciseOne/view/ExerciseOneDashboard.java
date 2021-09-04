package com.sirlocust.proyecto_java_final.model.exerciseOne.view;

import java.util.Scanner;

import com.sirlocust.proyecto_java_final.tools.VerifyData;

public class ExerciseOneDashboard {

  private final Scanner scanner = new Scanner(System.in);

  private String readLine() {
    return this.scanner.nextLine();
  }

  public void welcomeMessage() {
    System.out.println(" __  _    __  _        _    _   _    _______ ___      ______      _     __ _   ___ ___  ");
    System.out
        .println("/ /`| | |/ /\\| |      | |\\ | | | |\\/| |_| |_/ / \\    | |_( (`    | |\\/|/ /\\ \\_/ / | |_) ");
    System.out
        .println("\\_\\_\\_\\_/_/--|_|__    |_| \\\\_\\_|_|  |_|_|_| \\_\\_/    |_|__)_)    |_|  /_/--|_|\\_\\_|_| \\");

  }

  public Double getNumber() {

    Double result = 0.0;
    while (true) {
      System.out.println("digite Un numero ");
      String userInput = this.readLine();
      if (VerifyData.isNumber(userInput)) {
        result = Double.parseDouble(userInput);
        break;
      }
      System.out.println("digite un numero valido");
    }
    return result;
  }

  public boolean isBack() {
    System.out.println("Marque 1 para continuar o 2 para volver ");
    System.out.flush();
    if (readLine().equals("2")) {

      return true;
    }
    return false;
  }

}
