package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.TermTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TermTypeService {

    @Autowired
    TermTypeRepository termTypeRepository;
}
