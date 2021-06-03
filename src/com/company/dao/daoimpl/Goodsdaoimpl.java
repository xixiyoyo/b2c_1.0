package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Goods;
import com.company.entity.Page;
import com.company.entity.Users;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Goodsdaoimpl implements Basedao<Goods> {
  DaoUtils du = new DaoUtils();
  @Override
  public Goods getRow(ResultSet rs) {
    Goods goods = null;
    try {
      goods = new Goods(rs.getInt("gid"),rs.getInt("caid"),rs.getString("g_name"),rs.getString("g_imge"),rs.getInt("g_status"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return goods;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from goods");
    return result;
  }
  public List<Goods> showAllLim(Page page){
    List<Goods> list = null;
    list = du.commonsSelect("SELECT * FROM `goods` where g_status=0 LIMIT ?,?",new Goodsdaoimpl(),page.getStartPage(),page.getPageNum());
    return list;
  }
  public Users queryById(int id){
    Users users = null;
    List<Users> list = du.commonsSelect("select * from goods where gid=?",new Goodsdaoimpl(),id);
    if(list.size() > 0){
      users = list.get(0);
    }
    return users;
  }
}
