package com.company.entity;

public class G_detail {
  private int g_did;
  private int gid;  //商品主键
  private double d_price;
  private int d_count;  //库存
  private String d_color;
  private String d_describe; //详情
  private int g_dstatus;

  public G_detail() {
  }

  public G_detail(int g_did, int gid, double d_price, int d_count, String d_color, String d_describe, int g_dstatus) {
    this.g_did = g_did;
    this.gid = gid;
    this.d_price = d_price;
    this.d_count = d_count;
    this.d_color = d_color;
    this.d_describe = d_describe;
    this.g_dstatus = g_dstatus;
  }

  public int getG_did() {
    return g_did;
  }

  public void setG_did(int g_did) {
    this.g_did = g_did;
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public double getD_price() {
    return d_price;
  }

  public void setD_price(double d_price) {
    this.d_price = d_price;
  }

  public int getD_count() {
    return d_count;
  }

  public void setD_count(int d_count) {
    this.d_count = d_count;
  }

  public String getD_color() {
    return d_color;
  }

  public void setD_color(String d_color) {
    this.d_color = d_color;
  }

  public String getD_describe() {
    return d_describe;
  }

  public void setD_describe(String d_describe) {
    this.d_describe = d_describe;
  }

  public int getG_dstatus() {
    return g_dstatus;
  }

  public void setG_dstatus(int g_dstatus) {
    this.g_dstatus = g_dstatus;
  }

  @Override
  public String toString() {
    return "G_detail{" +
      "g_did=" + g_did +
      ", gid=" + gid +
      ", d_price=" + d_price +
      ", d_count=" + d_count +
      ", d_color='" + d_color + '\'' +
      ", d_describe='" + d_describe + '\'' +
      ", g_dstatus=" + g_dstatus +
      '}';
  }
}
