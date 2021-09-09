package com.sirlocust.proyecto_java_final.model.exerciseNine.model;

public class ChangeVowelFromText {

  private String textBase = "La sonrisa sera la mejor arma contra la tristeza";

  private String remplaceVowel() {
    return textBase.replaceAll("a", "e");
  }

  public String concatWords(String words) {
    return this.remplaceVowel() + " " + words;
  }
}
