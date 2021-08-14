package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelService {

    @Autowired
    LevelRepository levelRepository;
}
