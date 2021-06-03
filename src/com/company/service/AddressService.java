package com.company.service;

import com.company.entity.Address;

import java.util.List;

public interface AddressService {
  //查看用户地址
  public List<Address> checkAddressByUid(int uid);

  //查看地址信息

  public Address checkAddressByAid(int aid);

  //添加地址

  public int addAdress(Address address);

  //修改地址

  public int updateAddress(Address address);

  //删除地址

  public int delAddress(int aid);

}
