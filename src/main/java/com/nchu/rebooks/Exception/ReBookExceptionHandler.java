package com.nchu.rebooks.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ReBookExceptionHandler {

    @ExceptionHandler(ReBookException.class)
    public ResponseEntity<ReBookErrorMessage> handleReBookException(ReBookException ex){
        return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }
}
