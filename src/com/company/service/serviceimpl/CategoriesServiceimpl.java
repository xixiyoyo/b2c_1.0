package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Categoriesdaoimpl;
import com.company.entity.Categories;
import com.company.service.CategoriesService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class CategoriesServiceimpl implements CategoriesService {
  Categoriesdaoimpl cdi = new Categoriesdaoimpl();
  @Override
  public List<Categories> showFath() {
    List<Categories> categories = null;
    try {
      JdbcUtils.begin();
      categories = cdi.showFath();
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return categories;
  }

  @Override
  public List<Categories> showChil(int ca_pid) {
    List<Categories> categories = null;
    try {
      JdbcUtils.begin();
      categories = cdi.showChil(ca_pid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return categories;
  }


}
