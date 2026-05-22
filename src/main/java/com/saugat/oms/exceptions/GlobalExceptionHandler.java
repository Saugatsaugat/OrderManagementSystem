package com.saugat.oms.exceptions;

import com.saugat.oms.wrapper.api.APIErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<APIErrorResponse> handleBusiness(BusinessException ex, HttpServletRequest request) {
        log.error("Business_Error code={} message={}", ex.getCode(), ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new APIErrorResponse(
                                ex.getStatus().toString(),
                                ex.getError(),
                                ex.getMessage(),
                                request.getRequestURI(),
                                generateRequestId(),
                                null
                        )
                );
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIErrorResponse> handleResourceNotFound(ResourceNotFoundException ex, HttpServletRequest request){
        log.error("Resource_Not_Found_Error code={} message={}", HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new APIErrorResponse(
                                "404",
                                "RESOURCE_NOT_FOUND",
                                ex.getMessage(),
                                request.getRequestURI(),
                                generateRequestId(),
                                null
                        )
                );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIErrorResponse> handleGeneral(Exception ex, HttpServletRequest request) {
        log.error("Unhandled_Exception msg={}", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new APIErrorResponse(
                                "503",
                                "INTERNAL_SERVER_ERROR",
                                ex.getMessage(),
                                request.getRequestURI(),
                                generateRequestId(),
                                null
                        )
                );
    }

    public String generateRequestId(){
        return UUID.randomUUID().toString();
    }
}