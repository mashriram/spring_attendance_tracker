package com.shri.attendance_tracker.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column()
  private Date date;
  @Column()
  private boolean presence;
  @Column()
  private Date arrivalTime;
  @Column()
  private String studentId;
  @Column()
  private String subjectId;
  @Column()
  private int dayOrder;
  @Column()
  private String timeTableId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public boolean isPresence() {
    return presence;
  }

  public void setPresence(boolean presence) {
    this.presence = presence;
  }

  public Date getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public int getDayOrder() {
    return dayOrder;
  }

  public void setDayOrder(int dayOrder) {
    this.dayOrder = dayOrder;
  }

  public String getTimeTableId() {
    return timeTableId;
  }

  public void setTimeTableId(String timeTableId) {
    this.timeTableId = timeTableId;
  }

}
