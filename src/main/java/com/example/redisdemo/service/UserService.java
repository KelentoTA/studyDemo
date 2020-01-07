package com.example.redisdemo.service;

import com.example.redisdemo.entity.Student;
import java.util.List;

public interface UserService {
    List<Student> findStudent(Integer id);
}
