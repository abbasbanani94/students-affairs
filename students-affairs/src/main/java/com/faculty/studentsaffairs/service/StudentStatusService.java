package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.StudentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentStatusService {

    @Autowired
    StudentStatusRepository studentStatusRepository;
}
