package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.idcardEntity;

@Repository
public interface idcardRepository extends JpaRepository<idcardEntity,Integer>{

}