package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;
}
