package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.studentService;
import com.example.demo.entity.studentEntity;


@RestController
public class studentController{
    @Autowired studentService ser;
    @PostMapping("/stupost")
    public studentEntity sendData(@RequestBody studentEntity stu){
        return ser.postData(stu);
    }
    @GetMapping("/stuget")
    @PutMapping("/stuput")
    @DeleteMapping("/studelete")
}