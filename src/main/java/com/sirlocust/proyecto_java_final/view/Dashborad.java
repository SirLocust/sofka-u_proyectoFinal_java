package com.sirlocust.proyecto_java_final.view;

import java.util.Scanner;

import com.sirlocust.proyecto_java_final.tools.VerifyData;

public class Dashborad {

  private final Scanner scanner = new Scanner(System.in);

  public String readLine() {
    return this.scanner.nextLine();
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

  public String getString(String message) {
    System.out.println(message);
    return this.readLine();
  }

  public boolean isBack() {

    while (true) {
      this.clearConsole();
      System.out.println("Marque 1 para reptir el ejercisio o 2 para volver ");

      String userInput = this.readLine();

      if (VerifyData.isNumber(userInput)) {
        if (userInput.equals("2")) {

          return true;
        }
        break;
      }
      this.clearConsole();
      System.out.println("digite un numero valido");
    }

    return false;
  }

  public void principalMenu() {
    this.clearConsole();
    System.out.println(
        "** M E N U   P R I N C I P A L **\n" + "1. MAYOR DE 2 NÚMEROS\n" + "3. CALCULAR El AREA DE UN CÍRCULO\n"
            + "4. CALCULAR EL IVA DE UN PRODUCTO \n" + "5. PARES E IMPARES DE 1 AL 100 \n" + "7. INGRESA NÚMERO\n"
            + "8. ¿ES DÍA LABORAL? \n" + "9 REEMPLAZAR CADENA \n" + "10 QUITAR ESPACIOS EN BLANCO  \n"
            + "11 TAMAÑO DE FRASE Y NRO A-E-I-O-U  \n" + "12. DIFERENCIA EN UNA CADENA Y OTRA  \n"
            + "13 PEDIR FECHA ACTUAL \n " + "14 NROS HASTA EL 100  \n" + "15 MENÚ \n" + "16 CALCULAR DNI \n"
            + "17 TAMAÑO DE FRASE Y NRO A-E-I-O-U \n" + "18 SERIES Y VIDEOJUEGOS \n" + "19. SALIR \n");
  }

  public void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
