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
public class User implements Serializable {
  private int user_id, role_id;
  private String username, password, email;

  public int getUser_id() {
    return user_id;
  }

  public int getRole_id() {
    return role_id;
  }

  public String getEmail() {
    return email;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public void setRole_id(int role_id) {
    this.role_id = role_id;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeInt(getId());
//        out.writeBytes(getUsername());
//        out.writeBytes(getPassword());
//    }

//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        setId(in.readInt());
//        setUsername((String) in.readObject());
//        setPassword((String) in.readObject());
//    }

  public void setEmail(String email) {
    this.email = email;
  }
}
