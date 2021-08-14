package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

    @Autowired
    PlanRepository planRepository;
}
