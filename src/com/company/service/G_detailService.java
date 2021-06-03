package com.company.service;

import com.company.entity.G_detail;

import java.util.List;

public interface G_detailService {

  public List<G_detail> showById(int gid);
  public G_detail queryById(int g_did);
}
