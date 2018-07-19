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
public class Student extends User implements Serializable {
  String student_id, student_no, student_name, student_intake, student_ic;

  public String getStudent_ic() {
    return student_ic;
  }

  public void setStudent_ic(String student_ic) {
    this.student_ic = student_ic;
  }

  public String getStudent_id() {
    return student_id;
  }

  public String getStudent_no() {
    return student_no;
  }

  public String getStudent_name() {
    return student_name;
  }

  public String getStudent_intake() {
    return student_intake;
  }

  public void setStudent_id(String student_id) {
    this.student_id = student_id;
  }

  public void setStudent_no(String student_no) {
    this.student_no = student_no;
  }

  public void setStudent_name(String student_name) {
    this.student_name = student_name;
  }

  public void setStudent_intake(String student_intake) {
    this.student_intake = student_intake;
  }
}
