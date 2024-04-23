package com.shri.attendance_tracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shri.attendance_tracker.services.DatabaseService;

import java.util.List;

@RestController
public class DatabaseController {

  @Autowired
  private DatabaseService databaseService;

  @GetMapping("/tables")
  public List<String> getAllTableNames() {
    return databaseService.getAllTableNames();
  }

  @GetMapping("/tables/{tableName}")
  public List<String> getTableAttributes(@PathVariable String tableName) {
    return databaseService.getAttributesForTable(tableName);
  }
}