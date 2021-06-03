package com.company.service;

import com.company.entity.Goods;
import com.company.entity.Page;

import java.util.List;

public interface GoodsService {
  public List<Goods> showAlllim(Page page);
  public long totalRowByGoods();
}
