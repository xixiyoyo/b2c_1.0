package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Usersdaoimpl;
import com.company.entity.Users;
import com.company.service.UsersService;
import com.company.utils.JdbcUtils;

public class UsersServiceimpl implements UsersService {
  Usersdaoimpl udi = new Usersdaoimpl();
  @Override
  public Users login(String name) {
    Users users = null;
    try {
      JdbcUtils.begin();
      users = udi.queryByName(name);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return users;
  }

  @Override
  public int islogin(Users users, String password) {
    int result = 0;
    if(users.getPassword().equals(password)){
      result = 1;
    }
    return result;
  }

  @Override
  public int updateUser(Users users) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = udi.updateUsers(users);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }
}
