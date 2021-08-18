package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Term;
import com.faculty.studentsaffairs.repository.TermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermService {

    @Autowired
    TermRepository termRepository;

    public List<Term> findAllTerms () throws Exception {
        return termRepository.findAllTerms().orElseThrow(() ->
                new Exception("لا يوجد فصول في النظام، يرجى التواصل مع مدير النظام"));
    }
}
