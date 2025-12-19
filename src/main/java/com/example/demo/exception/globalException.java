package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestControllerAdvice
public class globalException{
    @ExceptionHandler(validationException.class)
    public ResponseBody<String> handleValidationException(validationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }
}