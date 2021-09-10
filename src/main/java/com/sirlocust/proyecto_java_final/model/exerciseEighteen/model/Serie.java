package com.sirlocust.proyecto_java_final.model.exerciseEighteen.model;

public class Serie implements IEntregable {

  private String title;
  private Integer countSeason;
  private boolean delivery;
  private String type = "comedia";
  private String autor = "roberto gomez bola;os";

  public Serie() {
  }

  @Override
  public String toString() {
    return "Serie [autor=" + autor + ", countSeason=" + countSeason + ", delivery=" + delivery + ", title=" + title
        + ", type=" + type + "]";
  }

  public Serie(String title, Integer countSeason, String type, String autor) {
    this.title = title;
    this.countSeason = countSeason;
    this.type = type;
    this.autor = autor;
  }

  public Serie(String title, String autor) {
    this.title = title;
    this.autor = autor;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getCountSeason() {
    return countSeason;
  }

  public void setCountSeason(Integer countSeason) {
    this.countSeason = countSeason;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  @Override
  public void delivering() {
    this.delivery = true;

  }

  @Override
  public void returnItem() {
    // TODO Auto-generated method stub
    this.delivery = false;
  }

  @Override
  public boolean isDelivery() {
    // TODO Auto-generated method stub
    return this.delivery;
  }

  @Override
  public Integer compareTo(Object elemnt) {
    Serie serie = (Serie) elemnt;
    return this.countSeason - serie.getCountSeason();
  }

}
