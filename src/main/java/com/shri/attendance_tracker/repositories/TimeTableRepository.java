package com.shri.attendance_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shri.attendance_tracker.models.Kaksha;
import com.shri.attendance_tracker.models.Subject;
import com.shri.attendance_tracker.models.TimeTable;

@CrossOrigin
public interface TimeTableRepository extends CrudRepository<TimeTable, String> {

  List<TimeTable> findByDayOrder(int dayOrder);

  List<TimeTable> findByKaksha(Kaksha kaksha);

  List<TimeTable> findBySubject(Subject subject);

}
