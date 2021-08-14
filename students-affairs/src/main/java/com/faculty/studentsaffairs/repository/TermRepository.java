package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermRepository extends JpaRepository<Term,Integer> {
}
