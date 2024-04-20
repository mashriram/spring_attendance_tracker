package com.shri.attendance_tracker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shri.attendance_tracker.models.Kaksha;
import java.util.List;

public interface KakshaRepository extends CrudRepository<Kaksha, String> {

  List<Kaksha> findByDepartment(String department);

  List<Kaksha> findByName(String name);

  List<Kaksha> findByYear(int year);

}
