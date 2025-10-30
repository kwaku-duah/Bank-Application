package com.banking.bankapp.exception;


import com.banking.bankapp.payload.GeneralErrorResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GeneralErrorResponseHandler> errorHandler(Exception ex) {
        GeneralErrorResponseHandler handler = new GeneralErrorResponseHandler("Something went wrong. Come back at a later time", HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(handler);

    }

}
