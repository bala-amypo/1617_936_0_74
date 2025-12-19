package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class idcardEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer reg;
    private String name;
    private 
}