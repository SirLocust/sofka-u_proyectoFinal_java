package com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.Serie;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.model.VideoJuego;
import com.sirlocust.proyecto_java_final.model.exerciseEighteen.view.ExerciseEighteenDashboard;

import lombok.AllArgsConstructor;

public class ExerciseEighteenController {

  public ExerciseEighteenController(ExerciseEighteenDashboard exerciseEighteenDashboard) {
    this.exerciseEighteenDashboard = exerciseEighteenDashboard;
  }

  private List<Serie> seriesList = new ArrayList<>(5);
  private List<VideoJuego> videoJuegos = new ArrayList<>(5);
  ExerciseEighteenDashboard exerciseEighteenDashboard;

  public boolean init() {
    while (true) {
      this.exerciseEighteenDashboard.welcomeMessage();
      this.initClass();
      if (this.exerciseEighteenDashboard.isBack()) {
        break;
      }
    }
    return true;
  }

  public void createSeriesList() {

    Serie serie1 = new Serie("rapido", 13, "", "");
    Serie serie2 = new Serie("caperucita", 15, "", "");
    Serie serie3 = new Serie("rojo", 12, "", "");
    Serie serie4 = new Serie("terminator", 4, "", "");
    Serie serie5 = new Serie("nemo", 6, "", "");
    this.seriesList.add(serie1);
    this.seriesList.add(serie2);
    this.seriesList.add(serie3);
    this.seriesList.add(serie4);
    this.seriesList.add(serie5);
  }

  private void createVidejuegosList() {
    VideoJuego vJuego1 = new VideoJuego("", 20, "accion", "konami");
    VideoJuego vJuego2 = new VideoJuego("", 10, "accion", "konami");
    VideoJuego vJuego3 = new VideoJuego("", 3, "accion", "konami");
    VideoJuego vJuego4 = new VideoJuego("", 5, "accion", "konami");
    VideoJuego vJuego5 = new VideoJuego("", 9, "accion", "konami");
    videoJuegos.add(vJuego1);
    videoJuegos.add(vJuego2);
    videoJuegos.add(vJuego3);
    videoJuegos.add(vJuego4);
    videoJuegos.add(vJuego5);
  }

  private void setDeliverRandom() {
    seriesList.get(2).delivering();
    seriesList.get(3).delivering();
    seriesList.get(4).delivering();
    videoJuegos.get(1).delivering();
    videoJuegos.get(3).delivering();
  }

  public int countDeliveringSeries() {
    int result = 0;
    for (Serie serie : seriesList) {
      if (serie.isDelivery()) {
        result++;
      }
    }
    return result;
  }

  private int countDeliveringVjuegos() {
    int result = 0;
    for (VideoJuego videoJuego : videoJuegos) {
      if (videoJuego.isDelivery()) {
        result++;
      }
    }
    return result;
  }

  private Serie serieSeasonGreater() {
    int result = 0;
    int tmpGreater = seriesList.get(0).getCountSeason();

    for (Serie serie : seriesList) {
      if (serie.getCountSeason() > tmpGreater) {
        result = seriesList.indexOf(serie);
      }
    }
    return seriesList.get(result);
  }

  private VideoJuego vJuegosHoursGreater() {
    int result = 0;
    int tmpGreater = videoJuegos.get(0).getHourEstimate();

    for (VideoJuego vJuego : videoJuegos) {
      if (vJuego.getHourEstimate() > tmpGreater) {
        result = videoJuegos.indexOf(vJuego);
      }
    }
    return videoJuegos.get(result);
  }

  private void initClass() {
    this.createSeriesList();
    this.createVidejuegosList();
    this.setDeliverRandom();
    System.out.println("series entregados = " + this.countDeliveringSeries());
    System.out.println("videojuegos entregados = " + this.countDeliveringVjuegos());
    System.out.println("videojuego con mayor horas estimaras = " + this.serieSeasonGreater().toString());
    System.out.println("serie  con  mas temporadas = " + this.vJuegosHoursGreater().toString());
  }

}
