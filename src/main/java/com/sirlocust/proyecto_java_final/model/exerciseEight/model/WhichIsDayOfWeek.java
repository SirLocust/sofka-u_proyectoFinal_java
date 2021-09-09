package com.sirlocust.proyecto_java_final.model.exerciseEight.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichIsDayOfWeek {

  private List<String> daysOfWeek = Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado",
      "domingo");

  public String isWorkingDay(String day) {
    if (!this.daysOfWeek.contains(day)) {
      return String.format("el dia \"%s\" no es un dia de la semana valido", day);
    }
    if (day.equals("sabado") || day.equals("domingo")) {
      return String.format("el dia \"%s\" no es un dia laboral", day);
    }
    return String.format("el dia \"%s\" es un dia laboral", day);

  }
}
