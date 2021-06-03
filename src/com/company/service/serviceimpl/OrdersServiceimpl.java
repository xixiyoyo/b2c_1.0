package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Ordersdaoimpl;
import com.company.entity.Orders;
import com.company.service.OrdersService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class OrdersServiceimpl implements OrdersService {
  Ordersdaoimpl odi = new Ordersdaoimpl();
  @Override
  public int addOrder(Orders orders) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = odi.addOrder(orders);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public List<Orders> searchOrders() {
    List<Orders> list = null;
    try {
      JdbcUtils.begin();
      list = odi.checkOrders();
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return list;
  }

  @Override
  public Orders checkOrderByOid(String oid) {
    Orders orders = null;
    try {
      JdbcUtils.begin();
      orders = odi.queryOrderByOid(oid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }

    return orders;
  }

  @Override
  public int alterOrder(Orders orders) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = odi.modityOrder(orders);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

}
