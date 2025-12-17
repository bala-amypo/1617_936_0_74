package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;


@Service 
public class studentServiceImpl implements studentService{
    @Autowired studentRepository student
    //save(),findAll(),findById(),deleteById(),existsById()
    public studentEntity postData(studentEntity stu){
        student.
        return stu;
    }

}