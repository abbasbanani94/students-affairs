package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Gender;
import com.faculty.studentsaffairs.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    @Autowired
    GenderRepository genderRepository;

    public List<Gender> findAllGenders() throws Exception {
        return genderRepository.findAllGenders().orElseThrow(() ->
                new Exception("لا يوجد أنواع جنس في النظام، يرجى التواصل مع مدير النظام"));
    }
}
