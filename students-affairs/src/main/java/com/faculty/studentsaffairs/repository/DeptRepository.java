package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeptRepository extends JpaRepository<Dept,Integer> {

    @Query(value = "select * from depts where dept_id in (select dept_id from user_depts where active = 1 and " +
            "user_id = :userId)",nativeQuery = true)
    Optional<List<Dept>> findDeptsByUser(@Param(value = "userId") Integer userId);
}
