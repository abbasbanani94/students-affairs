package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/Identity")
public class IdentityTypeController {

    @Autowired
    IdentityService identityService;

    @GetMapping("/combo")
    public ResponseEntity findIdentityCombo () throws Exception {
        return new ResponseEntity(identityService.findIdentityCombo().stream().map(id -> {
            return new ComboDto(id.getId(),id.getName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
