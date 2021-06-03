package com.company.service.serviceimpl;

import com.company.dao.daoimpl.Addressdaoimpl;
import com.company.entity.Address;
import com.company.service.AddressService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class AddressServiceimpl implements AddressService {
  Addressdaoimpl adi = new Addressdaoimpl();
  @Override
  public List<Address> checkAddressByUid(int uid) {
    List<Address> list = null;
    try {
      JdbcUtils.begin();
      list = adi.checkadress(uid);
      JdbcUtils.commit();
      return list;
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }

    return list;
  }

  @Override
  public Address checkAddressByAid(int aid) {
    Address address = null;
    try {
      JdbcUtils.begin();
      address = adi.checkByUid(aid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }

    return address;
  }

  @Override
  public int addAdress(Address address) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = adi.addAddress(address);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public int updateAddress(Address address) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = adi.updateAddress(address);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public int delAddress(int aid) {
    int result = 0;
    try {
      JdbcUtils.begin();
      result = adi.delAddress(aid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return result;
  }
}
