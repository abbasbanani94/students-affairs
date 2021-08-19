package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.IdentityType;
import com.faculty.studentsaffairs.repository.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityService {

    @Autowired
    IdentityRepository identityRepository;

    public List<IdentityType> findIdentityCombo() throws Exception {
        return identityRepository.findAllIdentityTypes().orElseThrow(() ->
                new Exception("لا يوجد انواع هويات في النظام، يرجى التواصل مع مدير النظام"));
    }
}
