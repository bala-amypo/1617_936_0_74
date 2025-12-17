package com.example.demo.entity;

import java.sql.Date;

@Entity
public class studentEntity{
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
        this.password=password
    }
    public void setCreateAt(Date createAt){
        this.createAt=createAt;
    }
    public Integer getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public Date getCreateAt(){
        return this.createAt;
    }
    public studentEntity(){

    }
    public studentEntity(Integer id,String username,String email,String password,Date createaAt){
        00000000000000000000000000000000000
    }
}