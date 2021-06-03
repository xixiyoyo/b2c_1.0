package com.company.entity;

public class Items {
  private int iid;
  private int g_did;  //商品详情主键
  private String oid;  //订单编号
  private int i_num;   //商品数量
  private double i_money;  //商品小计

  public Items(int iid, int g_did, String oid, int i_num, double i_money) {
    this.iid = iid;
    this.g_did = g_did;
    this.oid = oid;
    this.i_num = i_num;
    this.i_money = i_money;
  }

  public Items(int g_did, String oid, int i_num, double i_money) {
    this.g_did = g_did;
    this.oid = oid;
    this.i_num = i_num;
    this.i_money = i_money;
  }

  public int getIid() {
    return iid;
  }

  public void setIid(int iid) {
    this.iid = iid;
  }

  public int getG_did() {
    return g_did;
  }

  public void setG_did(int g_did) {
    this.g_did = g_did;
  }

  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public int getI_num() {
    return i_num;
  }

  public void setI_num(int i_num) {
    this.i_num = i_num;
  }

  public double getI_money() {
    return i_money;
  }

  public void setI_money(double i_money) {
    this.i_money = i_money;
  }

  @Override
  public String toString() {
    return "Items{" +
      "iid=" + iid +
      ", g_did=" + g_did +
      ", oid='" + oid + '\'' +
      ", i_num=" + i_num +
      ", i_money=" + i_money +
      '}';
  }
}
