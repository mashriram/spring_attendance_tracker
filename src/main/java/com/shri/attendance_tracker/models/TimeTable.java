package com.shri.attendance_tracker.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TimeTable {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column
  private int dayOrder;

  @Column
  private Date startTime;

  @Column
  private Date endTime;

  @Column
  private String classId;

  @Column
  private String subjectId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getDayOrder() {
    return dayOrder;
  }

  public void setDayOrder(int dayOrder) {
    this.dayOrder = dayOrder;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

}
