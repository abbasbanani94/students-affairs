package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/years")
public class YearController {

    @Autowired
    YearService yearService;

    @GetMapping("/combo")
    public ResponseEntity findAllYears () throws Exception {
        return new ResponseEntity(yearService.findAllYears().stream().map(year -> {
            return new ComboDto(year.getId(),year.getStartYear() + "-" + year.getEndYear());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
