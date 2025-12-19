package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.Resp

@RestControllerAdvice
public class globalException{
    @ExceptionHandler(validationException.class)
    public ResponseBody<String> handleValidationException(validationException ex){

    }
}