package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.IdentityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityRepository extends JpaRepository<IdentityType,Integer> {
}
