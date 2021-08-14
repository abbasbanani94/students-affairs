package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;
}
