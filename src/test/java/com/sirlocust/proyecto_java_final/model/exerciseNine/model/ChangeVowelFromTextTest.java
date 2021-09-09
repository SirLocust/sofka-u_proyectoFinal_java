package com.sirlocust.proyecto_java_final.model.exerciseNine.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChangeVowelFromTextTest {
  ChangeVowelFromText changeVowelFromText;

  @BeforeEach
  void init() {
    this.changeVowelFromText = new ChangeVowelFromText();
  }

  @Test
  @DisplayName("remplasa todas las a por e del texto base mas un texto")
  void should_return_textBase_with_change_vowel_a_by_e() {
    assertEquals("Le sonrise sere le mejor erme contre le tristeze Oscar tiene Buena Actitud",
        this.changeVowelFromText.concatWords("Oscar tiene Buena Actitud"));
  }
}
