package com.company.entity;

public class Roles {
  private int rid;
  private String r_type;

  public Roles() {
  }

  public Roles(int rid, String r_type) {
    this.rid = rid;
    this.r_type = r_type;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public String getR_type() {
    return r_type;
  }

  public void setR_type(String r_type) {
    this.r_type = r_type;
  }

  @Override
  public String toString() {
    return "Roles{" +
      "rid=" + rid +
      ", r_type='" + r_type + '\'' +
      '}';
  }
}
