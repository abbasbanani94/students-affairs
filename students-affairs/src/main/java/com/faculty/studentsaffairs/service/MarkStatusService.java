package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.MarkStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkStatusService {

    @Autowired
    MarkStatusRepository markStatusRepository;
}
