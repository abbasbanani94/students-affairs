package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<String> findDistinctPobCombo() {
        return studentRepository.findDistinctPob().orElse(new ArrayList<>());
    }

    public List<String> findDistinctNationalityCombo() {
        return studentRepository.findDistinctNationality().orElse(new ArrayList<>());
    }

    public List<String> findDistinctBloodCombo() {
        return studentRepository.findDistinctBlood().orElse(new ArrayList<>());
    }

    public List<String> findDistinctCertificateCombo() {
        return studentRepository.findDistinctCertificate().orElse(new ArrayList<>());
    }

    public List<String> findDistinctSchoolCombo() {
        return studentRepository.findDistinctSchool().orElse(new ArrayList<>());
    }

    public List<String> findDistinctSchoolYearCombo() {
        return studentRepository.findDistinctSchoolYear().orElse(new ArrayList<>());
    }

    public List<String> findDistinctCityCombo() {
        return studentRepository.findDistinctCity().orElse(new ArrayList<>());
    }
}
