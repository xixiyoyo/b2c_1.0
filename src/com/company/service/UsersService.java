package com.company.service;

import com.company.entity.Users;

public interface UsersService {
  public Users login(String name);
  public int islogin(Users users,String password);
  public int updateUser(Users users);
}
