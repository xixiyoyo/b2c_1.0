package com.company.utils;



import com.company.dao.Basedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUtils<T> {
  /**
   * 实现增删改查
   * **/
  public int commonsUpdate(String sql,Object...args){
    Connection conn =null;
    PreparedStatement pst = null;
    try {
      conn = JdbcUtils.getConnection();
      pst = conn.prepareStatement(sql);
      for (int i = 0; i < args.length; i++) {
        pst.setObject(i+1,args[i]);
      }
      int result = pst.executeUpdate();
      return result;
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      JdbcUtils.closeAll(null,pst,null);
    }
    return 0;
  }
  /**
   * 实现查询
   * **/
  public List<T> commonsSelect(String sql , Basedao<T> basedao, Object...args){

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    List<T> list = new ArrayList<>();
    try {
      conn = JdbcUtils.getConnection();
      pst = conn.prepareStatement(sql);
      if(args != null){
        for (int i = 0; i < args.length; i++) {
          pst.setObject(i+1,args[i]);
        }
      }

      rs = pst.executeQuery();
      while (rs.next()){
        T t = basedao.getRow(rs);
        list.add(t);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }
  public long commonsCount(String sql){
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    long result = 0;
    try {
      conn = JdbcUtils.getConnection();
      pst = conn.prepareStatement(sql);
      rs = pst.executeQuery();
      rs.next();
      result = rs.getLong("count(*)");
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      JdbcUtils.closeAll(null,pst,null);
    }

    return result;
  }

}
