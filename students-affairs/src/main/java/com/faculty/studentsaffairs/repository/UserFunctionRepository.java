package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.UserFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFunctionRepository extends JpaRepository<UserFunction,Integer> {
}
