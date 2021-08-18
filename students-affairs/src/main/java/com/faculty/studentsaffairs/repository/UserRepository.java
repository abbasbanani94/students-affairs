package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select * from users where active = 1 and user_id = :userId",nativeQuery = true)
    Optional<User> findUserById(@Param(value = "userId") Integer userId);
}
