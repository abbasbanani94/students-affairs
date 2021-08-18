package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Category;
import com.faculty.studentsaffairs.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAllCategories () throws Exception {
        return categoryRepository.findAllCategories().orElseThrow(() ->
                new Exception("لا يوجد فئات في النظام، يرجى التواصل مع مدير النظام"));
    }
}
