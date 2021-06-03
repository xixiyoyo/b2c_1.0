package com.company.entity;

import java.util.Date;

public class Orders {
  private String oid;  //订单编号
  private int aid;    //地址主键 与 Address表关联
  private int uid;    //用户主键 与 Users表关联
  private double o_money;   //订单总额
  private Date o_time;    //创建时间
  private Date o_paytime;   //支付时间
  private int ispay;    //支付状态  0 已创建未付款 1已付款未收到 2 已收到未评价 3 已评价
  private int o_status;   //是否删除

  public Orders() {
  }

  public Orders(String oid, int aid, int uid, double o_money, Date o_time, Date o_paytime, int ispay, int o_status) {
    this.oid = oid;
    this.aid = aid;
    this.uid = uid;
    this.o_money = o_money;
    this.o_time = o_time;
    this.o_paytime = o_paytime;
    this.ispay = ispay;
    this.o_status = o_status;
  }

  public Orders(String oid, int aid, int uid, double o_money, Date o_time, Date o_paytime) {
    this.oid = oid;
    this.aid = aid;
    this.uid = uid;
    this.o_money = o_money;
    this.o_time = o_time;
    this.o_paytime = o_paytime;
  }

  public Orders(String oid, int aid, int uid, double o_money) {
    this.oid = oid;
    this.aid = aid;
    this.uid = uid;
    this.o_money = o_money;
  }

  public Orders(String oid, int uid, double o_money) {
    this.oid = oid;
    this.uid = uid;
    this.o_money = o_money;
  }

  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public double getO_money() {
    return o_money;
  }

  public void setO_money(double o_money) {
    this.o_money = o_money;
  }

  public Date getO_time() {
    return o_time;
  }

  public void setO_time(Date o_time) {
    this.o_time = o_time;
  }

  public Date getO_paytime() {
    return o_paytime;
  }

  public void setO_paytime(Date o_paytime) {
    this.o_paytime = o_paytime;
  }

  public int getIspay() {
    return ispay;
  }

  public void setIspay(int ispay) {
    this.ispay = ispay;
  }

  public int getO_status() {
    return o_status;
  }

  public void setO_status(int o_status) {
    this.o_status = o_status;
  }

  @Override
  public String toString() {
    return "Orders{" +
      "oid='" + oid + '\'' +
      ", aid=" + aid +
      ", uid=" + uid +
      ", o_money=" + o_money +
      ", o_time=" + o_time +
      ", o_paytime=" + o_paytime +
      ", ispay=" + ispay +
      ", o_status=" + o_status +
      '}';
  }
}
