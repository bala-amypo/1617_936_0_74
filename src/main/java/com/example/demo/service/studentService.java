package com.example.demo.service;

import com.example.demo.entity.studentEntity;

public interface studentService{
    studentEntity postData(studentEntity stu);
    List<studentEntity> getValue();
    studentEntity putValue(Integer id,studentEntity stu);
    studentEntity deleteValue(Integer id);
}