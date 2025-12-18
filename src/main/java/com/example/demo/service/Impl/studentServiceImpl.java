package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;
import com.example.demo.repository.studentRepository;
import java.util.List;


@Service 
public class studentServiceImpl implements studentService{
    @Autowired studentRepository student;
    //save(),findAll(),findById(),deleteById(),existsById()
    @Override
    public studentEntity postData(studentEntity stu){
        return student.save(stu);
    }
    @Override
    public List<studentEntity> getAllData(){
        return student.findAll();
    }
    @Override
    public String deleteValue(Integer id){
        student.deleteById(id);
        return "Deleted Successfully";
    }
    @Override
    public studentEntity getById(Integer id);
        return student.findById(id);
    }
    // @Override
    // public studentEntity putValue(studentEntity stu){
    //     return student.save(stu);
    // }

}