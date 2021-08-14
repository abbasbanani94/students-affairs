package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.StatusLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusLogRepository extends JpaRepository<StatusLog,Integer> {
}
