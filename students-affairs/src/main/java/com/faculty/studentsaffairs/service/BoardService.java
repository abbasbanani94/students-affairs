package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;
}
