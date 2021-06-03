package com.company.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
  private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  /**
   * 1.字符串转Util.Date
   * **/
  public static Date strToUtil(String str){

    try {
      Date date = sdf.parse(str);
      return date;
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }
  /**
   * 2.util.Date转sql.Date
   * **/
  public static java.sql.Date utilToSql(Date date){
    return new java.sql.Date(date.getTime());
  }
  /**
   * 3.util转换为字符串
   *
   * **/
  public String utilToStr(Date date){
    return sdf.format(date);
  }
}
