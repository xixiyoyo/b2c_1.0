package com.company.service.serviceimpl;

import com.company.dao.daoimpl.G_detaildaoimpl;
import com.company.entity.G_detail;
import com.company.service.G_detailService;
import com.company.utils.JdbcUtils;

import java.util.List;

public class G_detailServiceimpl implements G_detailService {
  G_detaildaoimpl gdi = new G_detaildaoimpl();
  @Override
  public List<G_detail> showById(int gid) {
    List<G_detail> list = null;
    try {
      JdbcUtils.begin();
      list = gdi.queryById(gid);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return list;
  }

  @Override
  public G_detail queryById(int g_did) {
    G_detail g_detail = null;
    try {
      JdbcUtils.begin();
      g_detail = gdi.queryByDetailId(g_did);
      JdbcUtils.commit();
    } catch (Exception e) {
      JdbcUtils.rollback();
      e.printStackTrace();
    }
    return g_detail;
  }
}
