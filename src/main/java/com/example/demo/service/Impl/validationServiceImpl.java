package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.validationEntity;
import com.example.demo.service.validationService;
import com.example.demo.repository.validationRepository;
import java.util.List;


@Service 
public class validationServiceImpl implements validationService{
    @Autowired validationRepository valid;
    //save(),findAll(),findById(),deleteById(),existsById()
    @Override
    public validationEntity postData(validationEntity val){
        return valid.save(val);
    }
    @Override
    public List<validationEntity> getAllData(){
        return valid.findAll();
    }
    @Override
    public String deleteValue(Integer id){
        student.deleteById(id);
        return "Deleted Successfully";
    }
    @Override
    public studentEntity getById(Integer id){
        return student.findById(id).orElse(null);
    }
    @Override
    public studentEntity updateData(Integer id,studentEntity stu){
        if(student.existsById(id)){
            stu.setId(id);
            return student.save(stu);
        }
        return null;
    }
}