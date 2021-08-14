package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityService {

    @Autowired
    IdentityRepository identityRepository;
}
