package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController{
    @Autowired studentService serv;
    @PostMapping("/stupost")
    public studentEntity sendData(@RequestBody studentEntity stu){
        return serv.postData(stu);
    }
}