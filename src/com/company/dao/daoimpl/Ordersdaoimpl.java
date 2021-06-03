package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Orders;
import com.company.utils.DaoUtils;
import com.company.utils.DateUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Ordersdaoimpl implements Basedao<Orders> {
  DaoUtils du = new DaoUtils();
  @Override
  public Orders getRow(ResultSet rs) {
    Orders orders = null;
    try {
      orders = new Orders(rs.getString("oid"),rs.getInt("aid"),rs.getInt("uid"),rs.getDouble("o_money"),rs.getDate("o_time"),rs.getDate("o_paytime"),rs.getInt("ispay"),rs.getInt("o_status"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return orders;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from orders where o_status=0");
    return result;
  }

  public int addOrder(Orders orders){
    int result = 0;

    result = du.commonsUpdate("insert into orders (oid,aid,uid,o_money,o_time) value(?,?,?,?,?)",orders.getOid(),orders.getAid(),orders.getUid(),orders.getO_money(), DateUtils.utilToSql(new Date()));
    return result;

  }
  public int modityOrder(Orders orders){
    int result = 0;
    result = du.commonsUpdate("update orders set o_money=?,o_paytime=?,ispay=?,o_status=? where oid=?",orders.getO_money(),DateUtils.utilToSql(new Date()),orders.getIspay(),orders.getO_status(),orders.getOid());
    return result;
  }
  public int delOrder(String oid){
    int result = 0;
    result = du.commonsUpdate("delete * from orders where oid=?",oid);
    return result;
  }

  public List<Orders> checkOrders(){
    List<Orders> list = null;
    list = du.commonsSelect("select * from orders where o_status=0",new Ordersdaoimpl(),null);
    return list;
  }
  public Orders queryOrderByOid(String oid){
    Orders orders = null;
    List<Orders> list = du.commonsSelect("select * from orders where o_status=0 and oid=?",new Ordersdaoimpl(),oid);
    if(list.size() > 0){
      orders = list.get(0);
      return orders;
    }
    return orders;
  }



}
