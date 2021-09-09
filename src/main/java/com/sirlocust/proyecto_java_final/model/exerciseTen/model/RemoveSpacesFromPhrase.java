package com.sirlocust.proyecto_java_final.model.exerciseTen.model;

public class RemoveSpacesFromPhrase {

  public String removeSpace(String phrase) {
    String withOutSpace = phrase.replaceAll("\\s", "");
    return String.format("frase sin espacios: %s", withOutSpace);
  }
}
