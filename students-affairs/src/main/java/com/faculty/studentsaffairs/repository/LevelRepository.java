package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level,Integer> {
}
