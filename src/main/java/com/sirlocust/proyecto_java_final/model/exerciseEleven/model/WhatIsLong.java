package com.sirlocust.proyecto_java_final.model.exerciseEleven.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WhatIsLong {

  public String longAndVowelCount(String phrase) {
    List<Integer> list = countVowel(phrase);
    int lenght = this.removeSpace(phrase).length();
    return String.format("largo Frase es %s a: %d , e: %d , i: %d , o: %d , u: %d", lenght, list.get(0), list.get(1),
        list.get(2), list.get(3), list.get(4));
  }

  private List<Integer> countVowel(String phrase) {
    String[] arrString = removeSpace(phrase).split("");
    List<Integer> vowelList = Arrays.asList(0, 0, 0, 0, 0);
    for (String letter : arrString) {
      switch (letter) {
        case "a":
          vowelList.set(0, vowelList.get(0) + 1);
          break;
        case "e":
          vowelList.set(1, vowelList.get(1) + 1);
          break;
        case "i":
          vowelList.set(2, vowelList.get(2) + 1);
          break;
        case "o":
          vowelList.set(3, vowelList.get(3) + 1);
          break;
        case "u":
          vowelList.set(4, vowelList.get(4) + 1);
          break;
      }
    }
    return vowelList;
  }

  private String removeSpace(String phrase) {

    return phrase.replaceAll("\\s", "");
  }

}
