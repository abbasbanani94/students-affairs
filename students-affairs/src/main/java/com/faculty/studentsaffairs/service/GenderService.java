package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    @Autowired
    GenderRepository genderRepository;
}
