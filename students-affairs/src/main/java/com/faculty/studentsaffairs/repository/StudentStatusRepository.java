package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.StudentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentStatusRepository extends JpaRepository<StudentStatus,Integer> {

    @Query(value = "select * from student_status", nativeQuery = true)
    Optional<List<StudentStatus>> findAllStatus();
}
