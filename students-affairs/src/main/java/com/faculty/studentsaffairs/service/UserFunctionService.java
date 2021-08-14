package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.UserFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {

    @Autowired
    UserFunctionRepository userFunctionRepository;
}
