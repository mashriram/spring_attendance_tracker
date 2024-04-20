package com.shri.attendance_tracker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shri.attendance_tracker.models.Subject;
import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject, String> {

  List<Subject> findByCourseType(String courseType);

  List<Subject> findByRegulation(String regulation);

  List<Subject> findByCourseCode(String courseCode);

  List<Subject> findByName(String name);
}
