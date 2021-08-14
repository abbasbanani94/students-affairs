package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Integer> {
}
