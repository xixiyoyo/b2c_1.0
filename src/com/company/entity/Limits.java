package com.company.entity;

public class Limits {
  private int lid;
  private int rid;  //用户角色 与 Roles表关联
  private int lrank;  //权限等级 0 什么都不能做 1 可以下单 2 可以参加线下活动 3 可以更改数据

  public Limits(int lid, int rid, int lrank) {
    this.lid = lid;
    this.rid = rid;
    this.lrank = lrank;
  }

  public int getLid() {
    return lid;
  }

  public void setLid(int lid) {
    this.lid = lid;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public int getLrank() {
    return lrank;
  }

  public void setLrank(int lrank) {
    this.lrank = lrank;
  }

  @Override
  public String toString() {
    return "Limits{" +
      "lid=" + lid +
      ", rid=" + rid +
      ", lrank=" + lrank +
      '}';
  }
}
