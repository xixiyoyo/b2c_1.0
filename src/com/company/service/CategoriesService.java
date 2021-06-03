package com.company.service;

import com.company.entity.Categories;

import java.util.List;

public interface CategoriesService {
  public List<Categories> showFath();
  public List<Categories> showChil(int ca_pid);

}
