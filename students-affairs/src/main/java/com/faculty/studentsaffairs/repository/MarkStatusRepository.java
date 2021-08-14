package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.MarkStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkStatusRepository extends JpaRepository<MarkStatus,Integer> {
}
