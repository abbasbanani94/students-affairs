package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.FormFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormFunctionRepository extends JpaRepository<FormFunction,Integer> {
}
