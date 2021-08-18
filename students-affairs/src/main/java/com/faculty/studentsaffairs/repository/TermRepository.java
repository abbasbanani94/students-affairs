package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TermRepository extends JpaRepository<Term,Integer> {

    @Query(value = "select * from terms", nativeQuery = true)
    Optional<List<Term>> findAllTerms();
}
