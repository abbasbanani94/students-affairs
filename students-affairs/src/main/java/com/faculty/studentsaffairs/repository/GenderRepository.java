package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenderRepository extends JpaRepository<Gender,Integer> {

    @Query(value = "select * from genders", nativeQuery = true)
    Optional<List<Gender>> findAllGenders();
}
