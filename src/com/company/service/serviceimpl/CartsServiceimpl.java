package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Cartsdaoimpl;
import com.company.entity.Carts;
import com.company.service.CartsService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class CartsServiceimpl implements CartsService {
  Cartsdaoimpl cdi = new Cartsdaoimpl();
  @Override
  public int addCart(Carts carts) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = cdi.addCart(carts);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public int modifyCart(Carts carts) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = cdi.modifyCart(carts);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public int delCart(int spid) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = cdi.delCart(spid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public List<Carts> checkAllCart() {
    List<Carts> list = null;
    try {
      JdbcUtils.begin();
      list = cdi.checkCarts();
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return list;
  }

  @Override
  public Carts checkCartById(int spid) {
    Carts carts = null;
    try {
      JdbcUtils.begin();
      carts = cdi.checkCartById(spid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return carts;
  }
}
