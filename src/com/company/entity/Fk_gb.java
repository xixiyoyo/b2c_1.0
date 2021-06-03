package com.company.entity;

public class Fk_gb {   //品牌和商品的多对多表
  private int gid;
  private int bid;

  public Fk_gb(int gid, int bid) {
    this.gid = gid;
    this.bid = bid;
  }

  public Fk_gb() {
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  @Override
  public String toString() {
    return "Fk_gb{" +
      "gid=" + gid +
      ", bid=" + bid +
      '}';
  }
}
