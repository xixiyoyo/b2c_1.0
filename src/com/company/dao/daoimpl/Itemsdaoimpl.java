package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Items;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Itemsdaoimpl implements Basedao<Items> {
  DaoUtils du = new DaoUtils();
  @Override
  public Items getRow(ResultSet rs) {
    Items items = null;
    try {
      items = new Items(rs.getInt("iid"),rs.getInt("g_did"),rs.getString("oid"),rs.getInt("i_num"),rs.getDouble("i_money"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return items;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from items");
    return result;
  }

  public int addItem(Items items){
    int result = 0;
    result = du.commonsUpdate("insert into items (g_did,oid,i_num,i_money) value(?,?,?,?)",items.getG_did(),items.getOid(),items.getI_num(),items.getI_money());
    return result;
  }

  public List<Items> showByOrderId(String oid){
    List<Items> list = null;
    list = du.commonsSelect("select * from items where oid=?",new Itemsdaoimpl(),oid);
    return list;
  }


}
