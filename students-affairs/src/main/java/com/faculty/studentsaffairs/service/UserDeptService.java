package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.UserDeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDeptService {

    @Autowired
    UserDeptRepository userDeptRepository;
}
