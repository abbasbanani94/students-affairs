package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.UserDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDeptRepository extends JpaRepository<UserDept,Integer> {
}
