package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept,Integer> {
}
