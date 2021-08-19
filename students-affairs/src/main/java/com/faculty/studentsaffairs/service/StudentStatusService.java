package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.StudentStatus;
import com.faculty.studentsaffairs.repository.StudentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentStatusService {

    @Autowired
    StudentStatusRepository studentStatusRepository;

    public List<StudentStatus> findStatusCombo() throws Exception {
        return studentStatusRepository.findAllStatus().orElseThrow(() ->
                new Exception("لا يوجد حالات للطلاب في النظام، يرجى التواصل مع مدير النظام"));
    }
}
