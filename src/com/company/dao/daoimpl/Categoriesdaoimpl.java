package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Categories;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Categoriesdaoimpl implements Basedao<Categories> {
  DaoUtils du = new DaoUtils();
  @Override
  public Categories getRow(ResultSet rs) {
    Categories categories = null;
    try {
      categories = new Categories(rs.getInt("caid"),rs.getInt("ca_pid"),rs.getString("ca_name"));
      return categories;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return categories;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from categories");
    return result;
  }

  public List<Categories> showFath(){
    List<Categories> categories = null;
    categories = du.commonsSelect("select * from categories where ca_pid = 0",new Categoriesdaoimpl(),null);
    return  categories;
  }


  public List<Categories> showChil(int ca_pid){
    List<Categories> categories = null;
    categories = du.commonsSelect("select * from categories where ca_pid = ?",new Categoriesdaoimpl(),ca_pid);
    return  categories;
  }



}
