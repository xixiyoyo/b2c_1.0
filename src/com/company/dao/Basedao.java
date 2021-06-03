package com.company.dao;

import java.sql.ResultSet;

public interface Basedao<T> {
  public T getRow(ResultSet rs);
  public long getRowCount();
}
