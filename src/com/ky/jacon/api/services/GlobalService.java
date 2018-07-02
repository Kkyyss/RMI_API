/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ky.jacon.api.services;

import com.ky.jacon.api.Model.Email;
import com.ky.jacon.api.Model.Book;
import com.ky.jacon.api.Model.Issue;
import com.ky.jacon.api.Model.Student;
import com.ky.jacon.api.Model.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author kys
 */
public interface GlobalService extends Remote {
  User login(User user) throws RemoteException;

  // User
  User addUser(User user) throws RemoteException;
  void updateUser(User user) throws RemoteException;
  void deleteUser(int id) throws RemoteException;
  void getUser(String id) throws RemoteException;
  List<User> getUsers() throws RemoteException;
  
  // Student
  Student getStudent(String id) throws RemoteException;
  
  boolean sendEmail(Email email) throws RemoteException;
  
  // Book
  Book addBook(Book book) throws RemoteException;
  List<Book> getBooks() throws RemoteException;
  String returnBook(Issue issue) throws RemoteException;
  String updateBookQuantity(int num, String ISBN) throws RemoteException;
  
  // Issue
  String addIssue(Issue issue) throws RemoteException;
  List<Issue> getIssuesByUserId(String id) throws RemoteException;
  List<Issue> getIssues() throws RemoteException;
}
