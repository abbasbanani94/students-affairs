package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.SubjectTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectTypeService {

    @Autowired
    SubjectTypeRepository subjectTypeRepository;
}
