package com.sirlocust.proyecto_java_final.model.exerciseEight.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WhichIsDayOfWeekTest {

  WhichIsDayOfWeek whichIsDayOfWeek;

  @BeforeEach
  void init() {
    this.whichIsDayOfWeek = new WhichIsDayOfWeek();
  }

  @Test
  @DisplayName("debe devolver que la cadena ingresada no es un dia valido")
  void should_return_not_is_valid_day() {
    assertEquals("el dia \"sdadsad\" no es un dia de la semana valido", this.whichIsDayOfWeek.isWorkingDay("sdadsad"));
  }

  @Test
  @DisplayName("debe devolver que la cadena ingresada no es un dia laboral")
  void should_return_not_is_working_day() {
    assertEquals("el dia \"sabado\" no es un dia laboral", this.whichIsDayOfWeek.isWorkingDay("sabado"));
  }

  @Test
  @DisplayName("debe devolver que la cadena ingresada un dia laboral")
  void should_return_yes_working_day() {
    assertEquals("el dia \"lunes\" es un dia laboral", this.whichIsDayOfWeek.isWorkingDay("lunes"));
  }
}
