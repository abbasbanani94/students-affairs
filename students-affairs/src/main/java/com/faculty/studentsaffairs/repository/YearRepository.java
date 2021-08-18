package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface YearRepository extends JpaRepository<Year,Integer> {

    @Query(value = "select * from years where active = 1 order by year_id desc",nativeQuery = true)
    Optional<List<Year>> findAllYears();
}
