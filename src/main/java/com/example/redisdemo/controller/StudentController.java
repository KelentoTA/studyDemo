package com.example.redisdemo.controller;

import com.example.redisdemo.entity.Student;
import com.example.redisdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class StudentController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/{id}")
    public List<Student> findStudent(@PathVariable Integer id){
        return userServiceImpl.findStudent(id);
    }
}
