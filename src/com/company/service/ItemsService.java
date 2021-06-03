package com.company.service;

import com.company.entity.Items;

import java.util.List;

public interface ItemsService{
  public List<Items> checkByOid(String oid);
  public int addOrder(Items items);

}
