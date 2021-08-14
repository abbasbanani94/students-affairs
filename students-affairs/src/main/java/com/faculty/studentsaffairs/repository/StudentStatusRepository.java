package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.StudentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentStatusRepository extends JpaRepository<StudentStatus,Integer> {
}
