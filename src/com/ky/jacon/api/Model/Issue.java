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
public class Issue implements Serializable {
  private String tr_id;
  private Student tr_student;
  private String tr_date;
  private String tr_returned_date;
  private Book tr_book;
  private Status tr_status;

  public String getTr_id() {
    return tr_id;
  }

  public String getTr_date() {
    return tr_date;
  }

  public Status getTr_status() {
    return tr_status;
  }

  public void setTr_status(Status tr_status) {
    this.tr_status = tr_status;
  }

  public String getTr_returned_date() {
    return tr_returned_date;
  }

  public void setTr_returned_date(String tr_returned_date) {
    this.tr_returned_date = tr_returned_date;
  }


  
  public void setTr_id(String tr_id) {
    this.tr_id = tr_id;
  }

  public Student getTr_student() {
    return tr_student;
  }

  public void setTr_student(Student tr_student) {
    this.tr_student = tr_student;
  }

  public void setTr_date(String tr_date) {
    this.tr_date = tr_date;
  }

  public Book getTr_book() {
    return tr_book;
  }

  public void setTr_book(Book tr_book) {
    this.tr_book = tr_book;
  }
}
