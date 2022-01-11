package com.birt.undark.exceptions.handling;

import com.birt.undark.exceptions.AccessoryByIdNotFoundException;
import com.birt.undark.exceptions.PhoneByIdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UndarkExceptionHandler {

    @ExceptionHandler(PhoneByIdNotFoundException.class)
    public ResponseEntity handleException(PhoneByIdNotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(new MediaType("application",
                "problem+json")).body(e.getMessage());
    }

    // UPD 08\01\22

    @ExceptionHandler(AccessoryByIdNotFoundException.class)
    public ResponseEntity handleException(AccessoryByIdNotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(new MediaType("application",
                "problem+json")).body(e.getMessage());
    }
}

