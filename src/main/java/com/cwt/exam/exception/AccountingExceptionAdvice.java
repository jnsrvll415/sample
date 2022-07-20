package com.cwt.exam.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.logging.Logger;

@RestControllerAdvice
public class AccountingExceptionAdvice {


    Logger logger = Logger.getLogger(AccountingExceptionAdvice.class.getName());

    @ExceptionHandler
    public ResponseEntity<String> meetingSchedulerExceptionHandler (AccountingException exception) {
        logger.info("ERROR: " + exception.getMessage());
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
