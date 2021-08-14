package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.PlanSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PlanSubjectRepository extends JpaRepository<PlanSubject,Integer> {
}
