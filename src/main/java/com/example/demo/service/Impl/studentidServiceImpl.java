package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.studentid;
import com.example.demo.service.studentidService;
import com.example.demo.repository.studentidRepository;
import java.util.List;


@Service 
public class studentidServiceImpl implements studentidService{
    @Autowired studentidRepository valid;
    //save(),findAll(),findById(),deleteById(),existsById()
    @Override
    public studentid postData(studentid stuid){
        return valid.save(stuid);
    }
    // @Override
    // public List<validationEntity> getAllData(){
    //     return valid.findAll();
    // }
    // @Override
    // public String deleteValue(Long id){
    //     valid.deleteById(id);
    //     return "Deleted Successfully";
    // }
    // @Override
    // public validationEntity getById(Long id){
    //     return valid.findById(id).orElseThrow(()->new validationException("invalid Id"+id));
    // }
    // @Override
    // public validationEntity updateData(Long id,validationEntity val){
    //     if(valid.existsById(id)){
    //         val.setId(id);
    //         return valid.save(val);
    //     }
    //     return null;
    // }
}                                                                               