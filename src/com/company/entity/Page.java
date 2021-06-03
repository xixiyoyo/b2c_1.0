package com.company.entity;

public class Page {
  private Integer pageIndex;
  private Integer pageNum;
  private Integer startPage;
  private Integer totalRow;
  private Integer totalPage;

  public Page(Integer pageIndex, Integer pageNum) {
    this.pageIndex = pageIndex;
    this.pageNum = pageNum;
    this.setStartPage((pageIndex-1)*pageNum);
  }

  public Page(Integer pageIndex) {
    this(pageIndex,5);
  }

  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public Integer getStartPage() {
    return startPage;
  }

  public void setStartPage(Integer startPage) {
    this.startPage = startPage;
  }

  public Integer getTotalRow() {
    return totalRow;
  }

  public void setTotalRow(Integer totalRow) {
    this.totalRow = totalRow;
    this.setTotalPage( totalRow % pageNum == 0 ? totalRow/pageNum : totalRow/pageNum+1);
  }

  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }
}
