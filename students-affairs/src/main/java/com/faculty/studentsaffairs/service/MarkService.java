package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkService {

    @Autowired
    MarkRepository markRepository;
}
