package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.studentEntity;

@Repository
public interface studentRepository extends JpaRepository<studentEntity,Integer>{

}