package com.faculty.studentsaffairs.service;

import com.faculty.studentsaffairs.model.User;
import com.faculty.studentsaffairs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserById(Integer userId) throws Exception {
        return userRepository.findUserById(userId).orElseThrow(() -> new Exception("لا يوجد مستخدم بالرقم : " + userId));
    }
}
