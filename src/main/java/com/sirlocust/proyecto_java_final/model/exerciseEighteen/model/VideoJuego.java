package com.sirlocust.proyecto_java_final.model.exerciseEighteen.model;

public class VideoJuego implements IEntregable {

  @Override
  public String toString() {
    return "VideoJuego [company=" + company + ", delivery=" + delivery + ", hourEstimate=" + hourEstimate + ", title="
        + title + ", type=" + type + "]";
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getHourEstimate() {
    return hourEstimate;
  }

  public void setHourEstimate(Integer hourEstimate) {
    this.hourEstimate = hourEstimate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  private String title;
  private Integer hourEstimate = 10;
  private boolean delivery = false;
  private String type = "accion";
  private String company = "samsung";

  public VideoJuego(String title, Integer hourEstimate, String type, String company) {
    this.title = title;
    this.hourEstimate = hourEstimate;
    this.type = type;
    this.company = company;
  }

  public VideoJuego(String title, Integer hourEstimate) {
    this.title = title;
    this.hourEstimate = hourEstimate;
  }

  public VideoJuego() {
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
    VideoJuego vJuego = (VideoJuego) elemnt;
    return this.hourEstimate - vJuego.getHourEstimate();
  }
}
