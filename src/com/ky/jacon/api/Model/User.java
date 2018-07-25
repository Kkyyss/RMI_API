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
  private String user_id;
  
  private Role role;
  private String username, password, email;
  private int active;

  public String getUser_id() {
    return user_id;
  }

  public int getActive() {
    return active;
  }

  public void setActive(int active) {
    this.active = active;
  }


  public Role getRole() {
    return role;
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

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  

  public void setRole(Role role) {
    this.role = role;
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
