package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.PlanSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanSubjectService {

    @Autowired
    PlanSubjectRepository planSubjectRepository;
}
