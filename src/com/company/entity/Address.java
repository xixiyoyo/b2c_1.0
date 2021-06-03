package com.company.entity;

public class Address {
  private int aid;
  private int uid;  //用户主键
  private String aname;
  private String phonenum;
  private String province;  //省
  private String city;   //市
  private String town;   //镇
  private String a_detail;  //详细地址
  private int a_isdelete;
  private int a_isdefault;  //是否默认

  public Address(int aid, int uid, String aname, String phonenum, String province, String city, String town, String a_detail, int a_isdelete, int a_isdefault) {
    this.aid = aid;
    this.uid = uid;
    this.aname = aname;
    this.phonenum = phonenum;
    this.province = province;
    this.city = city;
    this.town = town;
    this.a_detail = a_detail;
    this.a_isdelete = a_isdelete;
    this.a_isdefault = a_isdefault;
  }

  public Address() {
  }

  public Address(int uid, String aname, String phonenum, String province, String city, String town, String a_detail) {
    this.uid = uid;
    this.aname = aname;
    this.phonenum = phonenum;
    this.province = province;
    this.city = city;
    this.town = town;
    this.a_detail = a_detail;
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

  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }

  public String getPhonenum() {
    return phonenum;
  }

  public void setPhonenum(String phonenum) {
    this.phonenum = phonenum;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getA_detail() {
    return a_detail;
  }

  public void setA_detail(String a_detail) {
    this.a_detail = a_detail;
  }

  public int getA_isdelete() {
    return a_isdelete;
  }

  public void setA_isdelete(int a_isdelete) {
    this.a_isdelete = a_isdelete;
  }

  public int getA_isdefault() {
    return a_isdefault;
  }

  public void setA_isdefault(int a_isdefault) {
    this.a_isdefault = a_isdefault;
  }

  @Override
  public String toString() {
    return "Address{" +
      "aid=" + aid +
      ", uid=" + uid +
      ", aname='" + aname + '\'' +
      ", phonenum='" + phonenum + '\'' +
      ", province='" + province + '\'' +
      ", city='" + city + '\'' +
      ", town='" + town + '\'' +
      ", a_detail='" + a_detail + '\'' +
      ", a_isdelete=" + a_isdelete +
      ", a_isdefault=" + a_isdefault +
      '}';
  }
}
