package com.example.demo.service;

import com.example.demo.entity.studentEntity;
import java.util.List;


public interface studentService{
    studentEntity postData(studentEntity stu);
    List<studentEntity> getAllData();
    String deleteValue(Integer id);
    studentEntity getById(Integer id);
    studentEntity updateData(Integer id,studentEntity stu);
    
}