package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;




@Entity
public class validationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String Username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=3,max=6)
    @NotNull(message="Password is mandatory")
    private String password;
    @NotNull
    @Positve
    @Max(30)
    private int age;
    
}