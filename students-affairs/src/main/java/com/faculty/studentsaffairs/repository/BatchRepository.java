package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BatchRepository extends JpaRepository<Batch,Integer> {

    @Query(value = "select * from batches where active = 1 order by batch_id desc",nativeQuery = true)
    Optional<List<Batch>> findAllBatches();
}
