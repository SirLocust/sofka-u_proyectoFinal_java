package com.sirlocust.proyecto_java_final.model.exerciseFive.model;

import java.util.ArrayList;
import java.util.List;

public class NumbersOddAndEven {

  public List<List<Integer>> generateOddAndEvenWhiel() {
    List<List<Integer>> lista = this.generateList();
    Integer count = 0;
    while (count >= 100) {
      if ((count % 2) == 0) {
        lista.get(0).add(count);
      } else {
        lista.get(1).add(count);
      }
    }
    return lista;
  }

  public List<List<Integer>> generateList() {
    List<List<Integer>> lista = new ArrayList<>();
    lista.add(new ArrayList<>());
    lista.add(new ArrayList<>());
    return lista;
  }
}
