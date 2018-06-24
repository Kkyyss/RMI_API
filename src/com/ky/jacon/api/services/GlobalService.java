/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ky.jacon.api.services;

import com.ky.jacon.api.Model.Email;
import com.ky.jacon.api.Model.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author kys
 */
public interface GlobalService extends Remote {
  boolean login(User user) throws RemoteException;

  User addUser(User user) throws RemoteException;
  void updateUser(User user) throws RemoteException;
  void deleteUser(int id) throws RemoteException;
  void getUser(int id) throws RemoteException;
  List<User> getUsers() throws RemoteException;
  
  boolean sendEmail(Email email) throws RemoteException;
}
