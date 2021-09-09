package com.sirlocust.proyecto_java_final.model.exerciseTen.view;

import com.sirlocust.proyecto_java_final.view.Dashborad;

public class ExerciseTenDashboard extends Dashborad {
  public ExerciseTenDashboard() {
    super();
  }

  @Override
  public String getString(String message) {

    return super.getString(message);
  }

  @Override
  public boolean isBack() {

    return super.isBack();
  }

  public void welcomeMessage() {
    System.out.println(" ____  ____  ____  ___  __  __     __  _  _   __ ");
    System.out.println("(  _ \\(  _ \\(  __)/ __)(  )/  \\   (  )/ )( \\ / _\\");
    System.out.println(" ) __/ )   / ) _)( (__  )((  O )   )( \\ \\/ //    \\");
    System.out.println("(__)  (__\\_)(____)\\___)(__)\\__/   (__) \\__/ \\_/\\_/");

  }
}
