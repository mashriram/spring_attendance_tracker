package com.shri.attendance_tracker.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

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

  // @Column
  // private String classId;

  // @Column
  // private String subjectId;

  @ManyToOne
  @JoinColumn(name = "kaksha_id")
  private Kaksha kaksha;

  @ManyToOne
  @JoinColumn(name = "subject_id")
  private Subject subject;

  @OneToMany(mappedBy = "timeTable")
  private List<Attendance> attendances;

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

  public Kaksha getKaksha() {
    return kaksha;
  }

  public void setKaksha(Kaksha kaksha) {
    this.kaksha = kaksha;
  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

}
