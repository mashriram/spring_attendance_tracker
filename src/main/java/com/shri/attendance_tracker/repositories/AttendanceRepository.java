package com.shri.attendance_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shri.attendance_tracker.models.Attendance;
import com.shri.attendance_tracker.models.Student;
import com.shri.attendance_tracker.models.TimeTable;

import java.util.Date;

@CrossOrigin
public interface AttendanceRepository extends CrudRepository<Attendance, String> {

  List<Attendance> findAllByOrderByIdAsc();

  List<Attendance> findByStudent(Student student);

  List<Attendance> findByTimeTable(TimeTable timeTable);

  List<Attendance> findByDate(Date date);

}
