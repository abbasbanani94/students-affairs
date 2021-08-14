package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.TermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TermService {

    @Autowired
    TermRepository termRepository;
}
