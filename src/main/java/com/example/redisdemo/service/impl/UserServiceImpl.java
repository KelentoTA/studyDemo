package com.example.redisdemo.service.impl;

import com.example.redisdemo.entity.Student;
import com.example.redisdemo.mapper.StudentMapper;
import com.example.redisdemo.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private StudentMapper studentMapper;

    @Cacheable(value="user",key="#id")
    public List<Student> findStudent(Integer id) {
        return studentMapper.find(id);
    }
}
