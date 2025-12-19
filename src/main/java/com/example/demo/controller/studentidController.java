package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.service.studentidService;
import com.example.demo.entity.studentidEntity;
import java.util.List;


@RestController
public class studentidController{
    @Autowired studentidService ser;
    @PostMapping("/stuidonetoonepost")
    public studentidEntity sendData(@RequestBody studentidEntity stuid){
        return ser.postData(stuid);
    }
    // @GetMapping("/valget")
    // public List<validationEntity> getData(){
    //     return ser.getAllData();
    // }
    // @DeleteMapping("/valdelete/{id}")
    // public String deleteData(@PathVariable Long id){
    //      return ser.deleteValue(id);
    // }
    // @GetMapping("/validget/{id}")
    // public validationEntity getOne(@PathVariable Long id){
    //     return ser.getById(id);
    // }
    // @PutMapping("/valput/{id}")
    // public validationEntity putData(@PathVariable Long id,@RequestBody ValidationEntity val){
    //     return ser.updateData(id,val);
    // }
}