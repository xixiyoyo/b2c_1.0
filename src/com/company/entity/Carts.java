package com.company.entity;

public class Carts {
  private int spid;
  private int g_did;
  private int uid;
  private int sp_num;
  private double sp_money;
  private int sp_status;

  public Carts(int spid, int g_did, int uid, int sp_num, double sp_money, int sp_status) {
    this.spid = spid;
    this.g_did = g_did;
    this.uid = uid;
    this.sp_num = sp_num;
    this.sp_money = sp_money;
    this.sp_status = sp_status;
  }

  public Carts(int spid, int g_did, int uid, int sp_num, double sp_money) {
    this.spid = spid;
    this.g_did = g_did;
    this.uid = uid;
    this.sp_num = sp_num;
    this.sp_money = sp_money;
  }

  public Carts() {
  }

  public Carts(int g_did, int uid, int sp_num, double sp_money) {
    this.g_did = g_did;
    this.uid = uid;
    this.sp_num = sp_num;
    this.sp_money = sp_money;
  }

  public int getSpid() {
    return spid;
  }

  public void setSpid(int spid) {
    this.spid = spid;
  }

  public int getG_did() {
    return g_did;
  }

  public void setG_did(int g_did) {
    this.g_did = g_did;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getSp_num() {
    return sp_num;
  }

  public void setSp_num(int sp_num) {
    this.sp_num = sp_num;
  }

  public double getSp_money() {
    return sp_money;
  }

  public void setSp_money(double sp_money) {
    this.sp_money = sp_money;
  }

  public int getSp_status() {
    return sp_status;
  }

  public void setSp_status(int sp_status) {
    this.sp_status = sp_status;
  }

  @Override
  public String toString() {
    return "Carts{" +
      "spid=" + spid +
      ", g_did=" + g_did +
      ", uid=" + uid +
      ", sp_num=" + sp_num +
      ", sp_money=" + sp_money +
      ", sp_status=" + sp_status +
      '}';
  }
}
