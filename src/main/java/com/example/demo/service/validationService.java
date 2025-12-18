package com.example.demo.service;

import com.example.demo.entity.validationEntity;
import java.util.List;


public interface validationService{
    validationEntity postData(validationEntity val);
    // List<validationEntity> getAllData();
    // String deleteValue(Long id);
    validationEntity getById(Long id);
    // validationEntity updateData(Long id,validationEntity val);
    
}