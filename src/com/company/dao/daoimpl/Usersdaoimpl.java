package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Users;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Usersdaoimpl implements Basedao<Users> {
  DaoUtils du = new DaoUtils();
  @Override
  public Users getRow(ResultSet rs) {
    Users user =  null;
    try {
      user = new Users(rs.getInt("uid"),rs.getInt("rid"),rs.getString("uname"),rs.getString("password"),rs.getString("email"),rs.getString("sex"),rs.getInt("u_status"),rs.getString("u_key"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return user;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from users");
    return result;
  }

  public Users queryByName(String name){
    Users users = null;
    List<Users> list = du.commonsSelect("select * from users where uname=?",new Usersdaoimpl(),name);
    if(list.size() > 0){
      users = list.get(0);
    }
    return users;
  }
  public int updateUsers(Users users){
    int result = 0;
    result = du.commonsUpdate("update users set uname=?,password=?,email=?,sex=? where uid=?",users.getUname(),users.getPassword(),users.getEmail(),users.getSex(),users.getUid());
    return result;
  }
  public int addUsers(Users users){
    int result = 0;
    result = du.commonsUpdate("insert into users (uname,password,email,sex) value(?,?,?,?)",users.getUname(),users.getPassword(),users.getEmail(),users.getSex());
    return result;
  }




}
