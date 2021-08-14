package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearRepository extends JpaRepository<Year,Integer> {
}
