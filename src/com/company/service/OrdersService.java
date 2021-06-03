package com.company.service;

import com.company.entity.Orders;

import java.util.List;

public interface OrdersService {
  public int addOrder(Orders orders);
  public List<Orders> searchOrders();
  public Orders checkOrderByOid(String oid);
  public int alterOrder(Orders orders);

}
