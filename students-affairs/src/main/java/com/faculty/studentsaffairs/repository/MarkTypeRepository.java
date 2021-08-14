package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.MarkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkTypeRepository extends JpaRepository<MarkType,Integer> {
}
