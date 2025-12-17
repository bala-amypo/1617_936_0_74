package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date createAt;
    public void setId(Integer id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setCreateAt(Date createAt){
        this.createAt=createAt;
    }
    public Integer getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Date getCreateAt(){
        return createAt;
    }
    public studentEntity(){

    }
    public studentEntity(Integer id,String username,String email,String password,Date createaAt){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.createAt=createAt;
    }
}