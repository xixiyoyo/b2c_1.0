package com.company.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static final Properties PROPERTIES =new Properties();
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();


    static {
      InputStream is = JdbcUtils.class.getResourceAsStream("/Jdbc.properties");
      try {
        PROPERTIES.load(is);
        try {
          Class.forName(PROPERTIES.getProperty("driver"));
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public static Connection getConnection(){
      Connection conn = threadLocal.get(); //将当前线程中绑定的Connection对象，赋值给connection
      try {
        if(conn == null){
          conn = DriverManager.getConnection(PROPERTIES.getProperty("url"),PROPERTIES.getProperty("username"),PROPERTIES.getProperty("password"));
          threadLocal.set(conn); //把连接存在当前线程共享中
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return conn;
    }

  public static void begin(){
    Connection conn = getConnection();
    try {
      conn.setAutoCommit(false);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void commit(){
    Connection conn= getConnection();
    try {
      conn.commit();
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      closeAll(conn,null,null);
    }
  }

  public static void rollback(){
    Connection conn = null;
    try {
      conn = getConnection();
      conn.rollback();
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      closeAll(conn,null,null);
    }
  }

  public static void closeAll(Connection conn, PreparedStatement pst, ResultSet rs){
    if(rs != null){
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(pst != null){
      try {
        pst.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(conn != null){
      try {
        conn.close();
        threadLocal.remove(); //关闭连接后，移除已关闭Connection对象
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

}
