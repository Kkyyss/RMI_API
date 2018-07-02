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
public class Email implements Serializable {
  private String from, to, subject, content;

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public String getSubject() {
    return subject;
  }
  

  public String getContent() {
    return content;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
  
}