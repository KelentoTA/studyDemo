package com.example.redisdemo.mapper;

import com.example.redisdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id=#{id}")
    List<Student> find(Integer id);
}
