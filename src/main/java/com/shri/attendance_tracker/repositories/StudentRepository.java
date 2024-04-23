package com.shri.attendance_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shri.attendance_tracker.models.Student;

@CrossOrigin
public interface StudentRepository extends CrudRepository<Student, String> {

  List<Student> findByName(String name);

  List<Student> findByRegisterNumber(String registerNumber);
}
