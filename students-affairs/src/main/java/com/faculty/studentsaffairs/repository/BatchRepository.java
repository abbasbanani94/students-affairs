package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends JpaRepository<Batch,Integer> {
}
