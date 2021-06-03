package com.company.dao.daoimpl;

import com.company.dao.Basedao;
import com.company.entity.Address;
import com.company.utils.DaoUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Addressdaoimpl implements Basedao<Address> {
  DaoUtils du = new DaoUtils();
  @Override
  public Address getRow(ResultSet rs) {
    Address address = null;
    try {
      address = new Address(rs.getInt("aid"),rs.getInt("uid"),rs.getString("aname"),rs.getString("phonenum"),rs.getString("province"),rs.getString("city"),rs.getString("town"),rs.getString("a_detail"),rs.getInt("a_isdelete"),rs.getInt("a_isdefault"));
      return address;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return address;
  }

  @Override
  public long getRowCount() {
    long result = 0;
    result = du.commonsCount("select count(*) from address where a_isdelete=0");
    return result;
  }

  public int addAddress(Address address){
    int result = 0;
    result = du.commonsUpdate("insert into address (uid,aname,phonenum,province,city,town,a_detail) value(?,?,?,?,?,?,?)",address.getUid(),address.getAname(),address.getPhonenum(),address.getProvince(),address.getCity(),address.getTown(),address.getA_detail());
    return result;
  }

  public List<Address> checkadress(int uid){
    List<Address> list = null;
    list = du.commonsSelect("select * from address where uid=? and a_isdelete=0",new Addressdaoimpl(),uid);

    return list;
  }

  public Address checkByUid(int aid){
    Address address = null;
    List<Address> list = du.commonsSelect("select * from address where aid=?",new Addressdaoimpl(),aid);
    if (list.size() > 0){
      address = list.get(0);
    }
    return address;
  }

  public int delAddress(int aid){
    int result = 0;
    result = du.commonsUpdate("update address set is_isdelete=1 where aid=?",aid);
    return result;
  }

  public int updateAddress(Address address){
    int result = 0;
    result = du.commonsUpdate("update address set aname=?,phonenum=?,province=?,city=?,town=?,a_detail=? where aid=?",address.getAname(),address.getPhonenum(),address.getProvince(),address.getCity(),address.getTown(),address.getA_detail());
    return result;
  }


}
