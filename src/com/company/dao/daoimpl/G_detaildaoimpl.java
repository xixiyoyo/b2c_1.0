package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.G_detail;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class G_detaildaoimpl implements Basedao<G_detail> {
  DaoUtils du = new DaoUtils();
  @Override
  public G_detail getRow(ResultSet rs) {
    G_detail g_detail = null;
    try {
      g_detail = new G_detail(rs.getInt("g_did"),rs.getInt("gid"),rs.getDouble("d_price"),rs.getInt("d_count"),rs.getString("d_color"),rs.getString("d_describe"),rs.getInt("g_dstatus"));
      return g_detail;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from g_detail");
    return result;
  }

  public List<G_detail> queryById(int gid){
    List<G_detail> g_details = null;
    g_details = du.commonsSelect("select * from g_detail where gid=?",new G_detaildaoimpl(),gid);
    return g_details;
  }

  public G_detail queryByDetailId(int g_did){
    G_detail g_detail = null;
    List<G_detail> list = du.commonsSelect("select * from g_detail where g_did=?",new G_detaildaoimpl(),g_did);
    if(list.size() > 0){
      g_detail = list.get(0);
    }
    return g_detail;
  }




}
