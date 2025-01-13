package com.Practice.Practice_New.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    
    @ExceptionHandler(RecordNotFoundExep.class)
    public String recordNotFoundException(RecordNotFoundExep recordNotFound){
        String message = recordNotFound.getMessage();
        return message;
    }
}
