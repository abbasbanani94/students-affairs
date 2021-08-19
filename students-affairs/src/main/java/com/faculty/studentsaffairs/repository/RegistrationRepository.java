package com.faculty.studentsaffairs.repository;

import com.faculty.studentsaffairs.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

    @Query(value = "select r.* from registrations r,students s where r.active = 1 and s.active = 1 and " +
            "r.registration_id = s.current_registration and r.dept_id = :deptId and r.batch_id = :batchId",
            nativeQuery = true)
    Optional<List<Registration>> findAllRegistrationsByDeptAndBatch(@Param(value = "deptId") Integer deptId,
                                                                    @Param(value = "batchId") Integer batchId);
}
