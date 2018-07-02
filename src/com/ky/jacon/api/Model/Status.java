/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ky.jacon.api.Model;

import java.io.Serializable;

/**
 *
 * @author kys
 */
public class Status implements Serializable {
  int status_id;
  String status_name;

  public int getStatus_id() {
    return status_id;
  }

  public String getStatus_name() {
    return status_name;
  }

  public void setStatus_id(int status_id) {
    this.status_id = status_id;
  }

  public void setStatus_name(String status_name) {
    this.status_name = status_name;
  }
  
  
}
