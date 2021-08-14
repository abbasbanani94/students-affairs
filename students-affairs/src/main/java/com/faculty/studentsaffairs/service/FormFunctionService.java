package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.FormFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormFunctionService {

    @Autowired
    FormFunctionRepository formFunctionRepository;
}
