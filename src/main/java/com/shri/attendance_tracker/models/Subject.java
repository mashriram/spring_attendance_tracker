package com.shri.attendance_tracker.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class Subject {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column
  private String name;

  @Column
  private int credits;

  @Column
  private int totalHours;

  @Column
  private String courseCode;

  @Column
  private String courseType;

  @Column
  private String regulation;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public int getTotalHours() {
    return totalHours;
  }

  public void setTotalHours(int totalHours) {
    this.totalHours = totalHours;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getCourseType() {
    return courseType;
  }

  public void setCourseType(String courseType) {
    this.courseType = courseType;
  }

  public String getRegulation() {
    return regulation;
  }

  public void setRegulation(String regulation) {
    this.regulation = regulation;
  }

}
