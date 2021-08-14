package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.SubjectType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectTypeRepository extends JpaRepository<SubjectType,Integer> {
}
