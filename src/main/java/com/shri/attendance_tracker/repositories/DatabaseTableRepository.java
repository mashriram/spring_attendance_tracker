package com.shri.attendance_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.attendance_tracker.models.DatabaseTable;

public interface DatabaseTableRepository extends JpaRepository<DatabaseTable, String> {
}
