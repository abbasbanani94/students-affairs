package com.faculty.studentsaffairs.controller;

import com.faculty.studentsaffairs.dto.ComboDto;
import com.faculty.studentsaffairs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/combo")
    public ResponseEntity findAllCategoriesCombo () throws Exception {
        return new ResponseEntity(categoryService.findAllCategories().stream().map(category -> {
            return new ComboDto(category.getId(),category.getArName());
        }).collect(Collectors.toList()), HttpStatus.OK);
    }
}
