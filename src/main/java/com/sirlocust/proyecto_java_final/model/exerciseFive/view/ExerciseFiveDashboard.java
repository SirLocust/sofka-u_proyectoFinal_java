package com.sirlocust.proyecto_java_final.model.exerciseFive.view;

import java.util.Arrays;
import java.util.List;

import com.sirlocust.proyecto_java_final.view.Dashborad;

public class ExerciseFiveDashboard extends Dashborad {

  @Override
  public boolean isBack() {

    return super.isBack();
  }

  public void welcomeMessage() {
    System.out.println(" ____   __   ____    _  _    __  _  _  ____   __   ____ ");
    System.out.println("(  _ \\ / _\\ (  _ \\  ( \\/ )  (  )( \\/ )(  _ \\ / _\\ (  _ \\");
    System.out.println(" ) __//    \\ )   /   )  /    )( / \\/ \\ ) __//    \\ )   /");
    System.out.println("(__)  \\_/\\_/(__\\_)  (__/    (__)\\_)(_/(__)  \\_/\\_/(__\\_)\n\n\n");
  }

  public void resultMessage(String cicleType, List<List<Integer>> list) {
    String pares = Arrays.toString(list.get(0).toArray());
    String impares = Arrays.toString(list.get(1).toArray());

    System.out.printf("Numero Pares y Impares usando %s \n\n", cicleType);
    System.out.println("numeros Pares \n" + pares);
    System.out.println("numeros Impares\n" + impares + "\n\n");
  }

  public ExerciseFiveDashboard() {
    super();
  }

}
