package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;
}
