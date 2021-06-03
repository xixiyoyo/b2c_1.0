package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Itemsdaoimpl;
import com.company.entity.Items;
import com.company.service.ItemsService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class ItemsServiceimpl implements ItemsService {
  Itemsdaoimpl idi = new Itemsdaoimpl();
  @Override
  public List<Items> checkByOid(String oid) {
    List<Items> list = null;
    try {
      JdbcUtils.begin();
      list = idi.showByOrderId(oid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return list;
  }

  @Override
  public int addOrder(Items items) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = idi.addItem(items);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }
}
