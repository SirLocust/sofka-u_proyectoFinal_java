package com.sirlocust.proyecto_java_final.model.exerciseFive.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersOddAndEvenTest {

  @Test
  @DisplayName("retorna una lista con dos lista una de numero pares y otra de numeros impares usando ciclo while")
  void testGenerateOddAndEvenWhile() {
    NumbersOddAndEven numbersOddAndEven = new NumbersOddAndEven();

    assertEquals(
        "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]",
        Arrays.toString(numbersOddAndEven.generateOddAndEvenWhile().get(1).toArray()));
    assertEquals(
        "[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]",
        Arrays.toString(numbersOddAndEven.generateOddAndEvenWhile().get(0).toArray()));

  }

  @Test
  @DisplayName("retorna una lista con dos lista una de numero pares y otra de numeros impares usando ciclo for")
  void testGenerateOddAndEvenFor() {
    NumbersOddAndEven numbersOddAndEven = new NumbersOddAndEven();

    assertEquals(
        "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]",
        Arrays.toString(numbersOddAndEven.generateOddAndEvenFor().get(1).toArray()));
    assertEquals(
        "[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]",
        Arrays.toString(numbersOddAndEven.generateOddAndEvenFor().get(0).toArray()));

  }

}
