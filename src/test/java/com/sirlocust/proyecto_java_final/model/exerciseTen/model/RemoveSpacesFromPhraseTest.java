package com.sirlocust.proyecto_java_final.model.exerciseTen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveSpacesFromPhraseTest {
  @Test
  void testRemoveSpace() {
    RemoveSpacesFromPhrase removeSpacesFromPhrase = new RemoveSpacesFromPhrase();
    assertEquals("frase sin espacios: holacomoestastu", removeSpacesFromPhrase.removeSpace("hola como estas tu"));
  }
}
