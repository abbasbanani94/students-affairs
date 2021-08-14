package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface MarkRepository extends JpaRepository<Mark, BigInteger> {
}
