package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Goodsdaoimpl;
import com.company.entity.Goods;
import com.company.entity.Page;
import com.company.service.GoodsService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class GoodsServiceimpl implements GoodsService {
  Goodsdaoimpl gdi = new Goodsdaoimpl();
  @Override
  public List<Goods> showAlllim(Page page) {
    List<Goods> list = null;
    try {
      JdbcUtils.begin();
      list = gdi.showAllLim(page);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return list;
  }
  @Override
  public long totalRowByGoods(){
    long result = 0;
    try {
      JdbcUtils.begin();
      result = gdi.getRowCount();
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }
}
