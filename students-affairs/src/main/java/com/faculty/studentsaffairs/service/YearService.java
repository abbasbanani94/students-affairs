package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearService {

    @Autowired
    YearRepository yearRepository;
}
