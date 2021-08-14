package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.MarkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkTypeService {

    @Autowired
    MarkTypeRepository markTypeRepository;
}
