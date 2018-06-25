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
public class Food implements Serializable {
  private int food_id;
  private String food_name;
  private double food_price;
  private String food_styles;

  public int getFood_id() {
    return food_id;
  }

  public String getFood_name() {
    return food_name;
  }

  public String getFood_styles() {
    return food_styles;
  }

  public double getFood_price() {
    return food_price;
  }


  public void setFood_id(int food_id) {
    this.food_id = food_id;
  }

  public void setFood_name(String food_name) {
    this.food_name = food_name;
  }

  public void setFood_price(double food_price) {
    this.food_price = food_price;
  }

  public void setFood_styles(String food_styles) {
    this.food_styles = food_styles;
  }


}
