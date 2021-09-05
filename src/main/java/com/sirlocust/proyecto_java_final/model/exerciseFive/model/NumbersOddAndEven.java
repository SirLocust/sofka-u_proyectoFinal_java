package com.sirlocust.proyecto_java_final.model.exerciseFive.model;

import java.util.ArrayList;
import java.util.List;

public class NumbersOddAndEven {

  public List<List<Integer>> generateOddAndEvenWhile() {
    List<List<Integer>> lista = this.generateList();
    Integer count = 0;
    while (count <= 100) {
      if ((count % 2) == 0) {
        lista.get(0).add(count);
      } else {
        lista.get(1).add(count);
      }
      count++;
    }
    return lista;
  }

  public List<List<Integer>> generateOddAndEvenFor() {
    List<List<Integer>> lista = this.generateList();
    for (int count = 0; count < 101; count++) {
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
