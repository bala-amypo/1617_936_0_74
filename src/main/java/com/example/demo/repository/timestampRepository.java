package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.timestamp;

@Repository
public interface timestampRepository extends JpaRepository<timestamp,Long>{

}