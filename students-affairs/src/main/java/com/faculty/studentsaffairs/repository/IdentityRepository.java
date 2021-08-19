package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.IdentityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IdentityRepository extends JpaRepository<IdentityType,Integer> {

    @Query(value = "select * from identity_types", nativeQuery = true)
    Optional<List<IdentityType>> findAllIdentityTypes();
}
