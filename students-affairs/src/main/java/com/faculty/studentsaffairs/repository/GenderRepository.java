package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender,Integer> {
}
