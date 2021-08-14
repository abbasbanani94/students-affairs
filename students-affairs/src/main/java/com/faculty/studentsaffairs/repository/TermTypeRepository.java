package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.TermType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermTypeRepository extends JpaRepository<TermType,Integer> {
}
