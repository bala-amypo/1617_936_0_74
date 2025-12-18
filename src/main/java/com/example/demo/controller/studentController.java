package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public List<studentEntity> getData(){
        return ser.getAllData();
    }
    @PutMapping("/stuput/{id}")
    public studentEntity putData(@PathVariable Integer id,@requestBody studentEntity stu){
        return ser.putValue(id,stu);
    }
    @DeleteMapping("/studelete/{id}")
    public String deleteData(@PathVariable Integer id){
        return ser.deleteValue(id);
    }
}