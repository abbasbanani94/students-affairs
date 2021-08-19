package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "select distinct pob from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctPob();

    @Query(value = "select distinct nationality from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctNationality();

    @Query(value = "select distinct blood from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctBlood();

    @Query(value = "select distinct certificate from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctCertificate();

    @Query(value = "select distinct school from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctSchool();

    @Query(value = "select distinct school_year from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctSchoolYear();

    @Query(value = "select distinct current_city from students where active = 1", nativeQuery = true)
    Optional<List<String>> findDistinctCity();
}
