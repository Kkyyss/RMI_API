/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ky.jacon.api.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author kys
 */
public class Transaction implements Serializable {
  private int tr_id, user_id;
  private String tr_date, tr_food, tr_total;

  public int getTr_id() {
    return tr_id;
  }

  public int getUser_id() {
    return user_id;
  }

  public String getTr_date() {
    return tr_date;
  }

  public String getTr_food() {
    return tr_food;
  }

  public String getTr_total() {
    return tr_total;
  }

  public void setTr_id(int tr_id) {
    this.tr_id = tr_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public void setTr_date(String tr_date) {
    this.tr_date = tr_date;
  }

  public void setTr_food(String tr_food) {
    this.tr_food = tr_food;
  }

  public void setTr_total(String tr_total) {
    this.tr_total = tr_total;
  }
}
