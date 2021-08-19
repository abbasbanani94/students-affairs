package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.service.StudentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-status")
public class StudentStatusController {

    @Autowired
    StudentStatusService statusService;

    @GetMapping("/combo")
    public ResponseEntity findStatusCombo () throws Exception {
        return new ResponseEntity(statusService.findStatusCombo(), HttpStatus.OK);
    }
}
