package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/terms")
public class TermController {

    @Autowired
    TermService termService;

    @GetMapping("/combo")
    public ResponseEntity findAllTermsCombo () throws Exception {
        return new ResponseEntity(termService.findAllTerms().stream().map(term -> {
            return new ComboDto(term.getId(),term.getArName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
