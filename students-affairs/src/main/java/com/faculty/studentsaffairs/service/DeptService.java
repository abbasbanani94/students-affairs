package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.Dept;
import com.faculty.studentsaffairs.model.User;
import com.faculty.studentsaffairs.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;

    @Autowired
    UserService userService;

    public List<Dept> findAllDeptsByUser (Integer userId) throws Exception {
        User user = userService.findUserById(userId);
        return deptRepository.findDeptsByUser(userId).orElseThrow(() ->
                new Exception("لا يوجد اقسام لهذا المستخدم، يرجى التواصل مع مدير النظام"));
    }
}
