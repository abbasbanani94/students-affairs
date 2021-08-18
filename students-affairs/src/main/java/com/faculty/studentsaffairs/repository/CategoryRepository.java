package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query(value = "select * from categories", nativeQuery = true)
    Optional<List<Category>> findAllCategories();
}
