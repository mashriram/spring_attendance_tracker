package com.shri.attendance_tracker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DatabaseTable {
  @Id
  private String tableName;

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }
}
