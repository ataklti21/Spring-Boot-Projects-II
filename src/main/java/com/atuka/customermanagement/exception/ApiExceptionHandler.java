package com.atuka.customermanagement.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;
//This class what the client see
@ControllerAdvice
public class ApiExceptionHandler {

    private final static Logger LOGGER=
            LoggerFactory.getLogger(ApiExceptionHandler.class);
    @ExceptionHandler(value = ApiRequestException.class)
    //Handler for Request Exception
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );
        return new ResponseEntity<>(apiException,
                HttpStatus.BAD_REQUEST);
    }
//Handler for NotFound Exception
    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleApiRequestException(NotFoundException e){
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now()
        );
        return new ResponseEntity<>(apiException,
                HttpStatus.NOT_FOUND);
    }
}
