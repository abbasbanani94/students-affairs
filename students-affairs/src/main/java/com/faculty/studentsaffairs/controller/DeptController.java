package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/combo")
    public ResponseEntity findAllDeptsByUser (@RequestHeader Integer userId) throws Exception {
        return new ResponseEntity(deptService.findAllDeptsByUser(userId).stream().map(dept -> {
            return new ComboDto(dept.getId(),dept.getArName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
