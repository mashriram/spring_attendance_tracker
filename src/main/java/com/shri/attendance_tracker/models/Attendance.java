package com.shri.attendance_tracker.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column()
  private Date date;
  @Column()
  private String presence;
  @Column()
  private Date arrivalTime;

  @Column()
  private int dayOrder;

  @ManyToOne
  @JoinColumn(name = "timetable_id")
  private TimeTable timeTable;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  public TimeTable getTimeTable() {
    return timeTable;
  }

  public void setTimeTable(TimeTable timeTable) {
    this.timeTable = timeTable;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

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

  public String getPresence() {
    return presence;
  }

  public void setPresence(String presence) {
    this.presence = presence;
  }

  public Date getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public int getDayOrder() {
    return dayOrder;
  }

  public void setDayOrder(int dayOrder) {
    this.dayOrder = dayOrder;
  }

}
