package com.company.entity;

public class Categories {
  private int caid;
  private int ca_pid;  //父类别
  private String ca_name;

  public Categories(int caid, int ca_pid, String ca_name) {
    this.caid = caid;
    this.ca_pid = ca_pid;
    this.ca_name = ca_name;
  }

  public Categories() {
  }

  public int getCaid() {
    return caid;
  }

  public void setCaid(int caid) {
    this.caid = caid;
  }

  public int getCa_pid() {
    return ca_pid;
  }

  public void setCa_pid(int ca_pid) {
    this.ca_pid = ca_pid;
  }

  public String getCa_name() {
    return ca_name;
  }

  public void setCa_name(String ca_name) {
    this.ca_name = ca_name;
  }

  @Override
  public String toString() {
    return "Categoriesdaoimpl{" +
      "caid=" + caid +
      ", ca_pid=" + ca_pid +
      ", ca_name='" + ca_name + '\'' +
      '}';
  }
}
