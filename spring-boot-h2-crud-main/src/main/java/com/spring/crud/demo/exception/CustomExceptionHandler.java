package com.spring.crud.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "com.spring.crud.demo")
public class CustomExceptionHandler {
    @ExceptionHandler(value={RecordNotFoundException.class})
    public ResponseEntity<String> handleNoSuchElementException(){
        return new ResponseEntity<>("*****No record*****",
                HttpStatus.NOT_FOUND);
    }




}
