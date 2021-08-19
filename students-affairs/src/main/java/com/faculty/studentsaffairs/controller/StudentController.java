package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/pob-combo")
    public ResponseEntity findPobCombo () {
        return new ResponseEntity(studentService.findDistinctPobCombo(), HttpStatus.OK);
    }

    @GetMapping("/nationality-combo")
    public ResponseEntity findNationalityCombo () {
        return new ResponseEntity(studentService.findDistinctNationalityCombo(), HttpStatus.OK);
    }

    @GetMapping("/blood-combo")
    public ResponseEntity findBloodCombo () {
        return new ResponseEntity(studentService.findDistinctBloodCombo(), HttpStatus.OK);
    }

    @GetMapping("/certificate-combo")
    public ResponseEntity findCertificateCombo () {
        return new ResponseEntity(studentService.findDistinctCertificateCombo(), HttpStatus.OK);
    }

    @GetMapping("/school-combo")
    public ResponseEntity findSchoolCombo () {
        return new ResponseEntity(studentService.findDistinctSchoolCombo(), HttpStatus.OK);
    }

    @GetMapping("/school-year-combo")
    public ResponseEntity findSchoolYearCombo () {
        return new ResponseEntity(studentService.findDistinctSchoolYearCombo(), HttpStatus.OK);
    }

    @GetMapping("/city-combo")
    public ResponseEntity findCityCombo () {
        return new ResponseEntity(studentService.findDistinctCityCombo(), HttpStatus.OK);
    }
}
