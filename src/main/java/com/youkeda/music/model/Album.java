package com.youkeda.music.model;

/**
 *
 */
//这是一个专辑的实体类
public class Album {

  private String id;
  private String name;
  private String picUrl;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }
}
