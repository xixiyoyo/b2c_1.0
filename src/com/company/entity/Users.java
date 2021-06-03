package com.company.entity;

public class Users {
  private int uid;
  private int rid;  //用户角色 与 Roles表关联
  private String uname;
  private String password;
  private String email;
  private String sex;
  private int u_status;  //用户状态
  private String u_key;  //邮箱验证码

  public Users() {
  }

  public Users(int uid, int rid, String uname, String password, String email, String sex, int u_status, String u_key) {
    this.uid = uid;
    this.rid = rid;
    this.uname = uname;
    this.password = password;
    this.email = email;
    this.sex = sex;
    this.u_status = u_status;
    this.u_key = u_key;
  }

  public Users(int uid, String uname, String password, String email, String sex) {
    this.uid = uid;
    this.uname = uname;
    this.password = password;
    this.email = email;
    this.sex = sex;
  }


  public Users(String uname, String password, String email, String sex) {
    this.uname = uname;
    this.password = password;
    this.email = email;
    this.sex = sex;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getU_status() {
    return u_status;
  }

  public void setU_status(int u_status) {
    this.u_status = u_status;
  }

  public String getU_key() {
    return u_key;
  }

  public void setU_key(String u_key) {
    this.u_key = u_key;
  }

  @Override
  public String toString() {
    return "Users{" +
      "uid=" + uid +
      ", rid=" + rid +
      ", uname='" + uname + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      ", sex='" + sex + '\'' +
      ", u_status=" + u_status +
      ", u_key='" + u_key + '\'' +
      '}';
  }
}
