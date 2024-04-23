package com.shri.attendance_tracker.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

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

  @Column
  @ManyToMany(mappedBy = "subjects", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<Kaksha> kaksha;

  @Column
  @OneToMany(mappedBy = "subject")
  private List<TimeTable> timeTables;

  public List<Kaksha> getKaksha() {
    return kaksha;
  }

  public void setKaksha(List<Kaksha> kaksha) {
    this.kaksha = kaksha;
  }

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
