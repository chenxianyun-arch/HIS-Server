package com.cxy.utils;

/**
 * 将json字符串转化成为这个对象,方便获取这个对象的id
 */
public class ConvertToInt {

  private Integer deleteId;

  public Integer getDeleteId() {
    return deleteId;
  }

  public void setDeleteId(Integer deleteId) {
    this.deleteId = deleteId;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  public ConvertToInt(Integer deleteId) {
    this.deleteId = deleteId;
  }

  public ConvertToInt() {
  }
}
