package com.company.service;

import com.company.entity.Carts;

import java.util.List;

public interface CartsService {
  public int addCart(Carts carts);
  public int modifyCart(Carts carts);
  public int delCart(int spid);
  public List<Carts> checkAllCart();
  public Carts checkCartById(int spid);

}
