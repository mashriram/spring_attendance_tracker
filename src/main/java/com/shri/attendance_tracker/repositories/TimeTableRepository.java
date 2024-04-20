package com.shri.attendance_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shri.attendance_tracker.models.TimeTable;

public interface TimeTableRepository extends CrudRepository<TimeTable, String> {
  List<TimeTable> findByClassId(String classId);

  List<TimeTable> findByDayOrder(int dayOrder);

  List<TimeTable> findBySubjectId(String subjectId);
}
