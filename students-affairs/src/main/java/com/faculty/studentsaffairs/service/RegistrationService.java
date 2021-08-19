package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Registration;
import com.faculty.studentsaffairs.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public List<Registration> findAllRegistrationsByDeptAndBatch(Integer deptId, Integer batchId) {
        return registrationRepository.findAllRegistrationsByDeptAndBatch(deptId,batchId).orElse(new ArrayList<>());
    }
}
