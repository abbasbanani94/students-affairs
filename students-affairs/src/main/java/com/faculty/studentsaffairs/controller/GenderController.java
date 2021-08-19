package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/genders")
public class GenderController {

    @Autowired
    GenderService genderService;

    @GetMapping("/combo")
    public ResponseEntity findGendersCombo () throws Exception {
        return new ResponseEntity(genderService.findAllGenders().stream().map(gender -> {
            return new ComboDto(gender.getId(),gender.getArName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
