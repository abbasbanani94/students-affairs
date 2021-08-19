package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Year;
import com.faculty.studentsaffairs.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearService {

    @Autowired
    YearRepository yearRepository;

    public List<Year> findAllYears () throws Exception {
        return yearRepository.findAllYears().orElseThrow(() ->
                new Exception("لا يوجد اعوام في النظام، يرجى التواصل مع مدير النظام"));
    }

    public Year findCurrentYear () throws Exception {
        return yearRepository.findCurrentYear().orElseThrow(() ->
                new Exception("لا يوجد عام حالي، يرجى التواصل مع مدير النظام"));
    }
}
