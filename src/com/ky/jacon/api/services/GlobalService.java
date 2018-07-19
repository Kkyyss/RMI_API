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
  String deleteUser(String id) throws RemoteException;
  User getUserByEmail(String email) throws RemoteException;
  User getUserByUsername(String username) throws RemoteException;
  String saveUserPwd(User u) throws RemoteException;
  String saveUserInfo(User u) throws RemoteException;
  List<User> getUsers() throws RemoteException;
  
  // Student
  Student addStudent(Student student) throws RemoteException;
  Student addStudentProfile(Student student) throws RemoteException;
  Student getStudent(String id) throws RemoteException;
  Student getStudentProfile(String uid) throws RemoteException;
  List<Student> getStudents() throws RemoteException;
  
  boolean sendEmail(Email email) throws RemoteException;
  
  // Book
  Book addBook(Book book) throws RemoteException;
  Book getBook(String id) throws RemoteException;
  List<Book> getBooks() throws RemoteException;
  String returnBook(Issue issue) throws RemoteException;
  String updateBookQuantity(int num, String ISBN) throws RemoteException;
  
  // Issue
  String addIssue(Issue issue) throws RemoteException;
  List<Issue> getIssuesByUserId(String id) throws RemoteException;
  List<Issue> getIssues() throws RemoteException;
}
