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
public class Book implements Serializable {
  private String book_id;
  private String book_name, book_author, book_subject, book_publisher, book_isbn;
  private int book_quantity;

  public String getBook_id() {
    return book_id;
  }

  public void setBook_author(String book_author) {
    this.book_author = book_author;
  }

  public String getBook_author() {
    return book_author;
  }

  public String getBook_name() {
    return book_name;
  }

  public String getBook_subject() {
    return book_subject;
  }

  public String getBook_publisher() {
    return book_publisher;
  }

  public String getBook_isbn() {
    return book_isbn;
  }

  public int getBook_quantity() {
    return book_quantity;
  }

  public void setBook_id(String book_id) {
    this.book_id = book_id;
  }

  public void setBook_name(String book_name) {
    this.book_name = book_name;
  }

  public void setBook_subject(String book_subject) {
    this.book_subject = book_subject;
  }

  public void setBook_publisher(String book_publisher) {
    this.book_publisher = book_publisher;
  }

  public void setBook_isbn(String book_isbn) {
    this.book_isbn = book_isbn;
  }

  public void setBook_quantity(int book_quantity) {
    this.book_quantity = book_quantity;
  }
}
