package org.kunggea.demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Log the exception (optional)
        ex.printStackTrace();

        // Return a generic error response
        return new ResponseEntity<>("错误发生了 An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        // Log the exception (optional)
        ex.printStackTrace();

        // Return a specific error response for IllegalArgumentException
        return new ResponseEntity<>("非法的参数 Invalid argument: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    // Add more exception handlers as needed
}