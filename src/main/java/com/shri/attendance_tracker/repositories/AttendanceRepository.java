package com.shri.attendance_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shri.attendance_tracker.models.Attendance;
import java.util.Date;

public interface AttendanceRepository extends CrudRepository<Attendance, String> {
  List<Attendance> findByStudentId(String studentId);

  List<Attendance> findBySubjectId(String subjectId);

  List<Attendance> findByDate(Date date);

}
