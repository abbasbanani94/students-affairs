package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.StatusLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusLogService {

    @Autowired
    StatusLogRepository statusLogRepository;
}
