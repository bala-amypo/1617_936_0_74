package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.studentService;
import com.example.demo.entity.studentEntity;


@RestController
public class studentController{
    @Autowired studentService serv;
    @PostMapping("/stupost")
    public studentEntity sendData(@RequestBody studentEntity stu){
        return serv.postData(stu);
    }
}