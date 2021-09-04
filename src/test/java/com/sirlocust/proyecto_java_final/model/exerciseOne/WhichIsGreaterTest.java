package com.sirlocust.proyecto_java_final.model.exerciseOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WhichIsGreaterTest {

  PrintStream save_out = System.out;
  ByteArrayOutputStream out = new ByteArrayOutputStream();

  @BeforeEach
  void redirectSystemOutStream() {
    System.setOut(new PrintStream(out));
  }

  @AfterEach
  void restoreSystemOutStream() {
    System.setOut(save_out);
  }

  // @Test
  // void it_prints_out() {

  // System.out.println("Hello World!");
  // assertEquals("Hello World!\r\n", out.toString());

  // }

  @Test
  @DisplayName("probando si el primer numero es mayor que el segundo")
  void the_number_one_is_greater_that_number_two() {
    WhichIsGreater whichIsGreater = new WhichIsGreater(10.0, 2.0);
    whichIsGreater.isGreater();
    assertEquals("10,0 es mayor que 2,0", out.toString());

  }

  @Test
  @DisplayName("probando si el segundo numero es mayor que el primero")
  void the_number_two_is_greater_that_number_one() {
    WhichIsGreater whichIsGreater = new WhichIsGreater(3.0, 10.0);
    whichIsGreater.isGreater();
    assertEquals("10,0 es mayor que 3,0", out.toString());

  }

  @Test
  @DisplayName("probando si los dos numeros son igual")
  void the_number_two_is_same_that_number_one() {
    WhichIsGreater whichIsGreater = new WhichIsGreater(3.0, 3.0);
    whichIsGreater.isGreater();
    assertEquals("3,0 es igual que 3,0", out.toString());

  }
}
