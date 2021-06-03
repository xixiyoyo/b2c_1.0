package com.company.entity;

public class Goods {
  private int gid;
  private int caid;  //类别主键
  private String g_name;
  private String g_imge; //图片地址
  private int g_status;

  public Goods(int gid, int caid, String g_name, String g_imge, int g_status) {
    this.gid = gid;
    this.caid = caid;
    this.g_name = g_name;
    this.g_imge = g_imge;
    this.g_status = g_status;
  }

  public Goods() {
  }

  public int getGid() {
    return gid;
  }

  public void setGid(int gid) {
    this.gid = gid;
  }

  public int getCaid() {
    return caid;
  }

  public void setCaid(int caid) {
    this.caid = caid;
  }

  public String getG_name() {
    return g_name;
  }

  public void setG_name(String g_name) {
    this.g_name = g_name;
  }

  public String getG_imge() {
    return g_imge;
  }

  public void setG_imge(String g_imge) {
    this.g_imge = g_imge;
  }

  public int getG_status() {
    return g_status;
  }

  public void setG_status(int g_status) {
    this.g_status = g_status;
  }

  @Override
  public String toString() {
    return "Goods{" +
      "gid=" + gid +
      ", caid=" + caid +
      ", g_name='" + g_name + '\'' +
      ", g_imge='" + g_imge + '\'' +
      ", g_status=" + g_status +
      '}';
  }
}
