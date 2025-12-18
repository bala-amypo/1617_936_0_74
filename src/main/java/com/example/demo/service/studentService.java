package com.example.demo.service;

import com.example.demo.entity.studentEntity;

public interface studentService{
    studentEntity postData(studentEntity stu);
    List<studentEntity> getAllData();
    studentEntity putValue(Integer id,studentEntity stu);
    String deleteValue(Integer id);
}