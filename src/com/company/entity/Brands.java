package com.company.entity;

public class Brands {
  private int bid;
  private String b_name;
  private int b_hot;

  public Brands(int bid, String b_name, int b_hot) {
    this.bid = bid;
    this.b_name = b_name;
    this.b_hot = b_hot;
  }

  public Brands() {
  }

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  public String getB_name() {
    return b_name;
  }

  public void setB_name(String b_name) {
    this.b_name = b_name;
  }

  public int getB_hot() {
    return b_hot;
  }

  public void setB_hot(int b_hot) {
    this.b_hot = b_hot;
  }

  @Override
  public String toString() {
    return "Brands{" +
      "bid=" + bid +
      ", b_name='" + b_name + '\'' +
      ", b_hot=" + b_hot +
      '}';
  }
}
