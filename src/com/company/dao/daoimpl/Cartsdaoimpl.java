package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Carts;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Cartsdaoimpl implements Basedao<Carts> {
  DaoUtils du = new DaoUtils();
  @Override
  public Carts getRow(ResultSet rs) {
    Carts carts = null;
    try {
      carts = new Carts(rs.getInt("spid"),rs.getInt("g_did"),rs.getInt("uid"),rs.getInt("sp_num"),rs.getDouble("sp_money"),rs.getInt("sp_status"));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return carts;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from carts");
    return result;
  }

  public int addCart(Carts carts){
    int result = 0;
    result = du.commonsUpdate("insert into carts (g_did,uid,sp_num,sp_money) value(?,?,?,?)",carts.getG_did(),carts.getUid(),carts.getSp_num(),carts.getSp_money());
    return result;
  }

  public int modifyCart(Carts carts){
    int result = 0;
    result = du.commonsUpdate("update carts set sp_num=?,sp_money=?,sp_status=? where spid=?",carts.getSp_num(),carts.getSp_money(),carts.getSp_status(),carts.getSpid());
    return result;
  }
  public int delCart(int spid){
    int result = 0;
    result = du.commonsUpdate("update carts set sp_status=1 where spid=?",spid);
    return result;
  }
  public List<Carts> checkCarts(){
    List<Carts> carts = null;
    carts = du.commonsSelect("select * from carts where sp_status = 0",new Cartsdaoimpl(),null);
    return carts;
  }

  public Carts checkCartById(int spid){
    Carts carts = null;
    List<Carts> list = du.commonsSelect("select * from carts where sp_status = 0 and spid=?",new Cartsdaoimpl(),spid);
    if(list.size() > 0){
      carts = list.get(0);
    }
    return carts;
  }





}
