package com.nucleusteq.helpdeskmanagement.exception.handler;

import com.nucleusteq.helpdeskmanagement.exception.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author global exception handler.
 *
 */
@ControllerAdvice
public final class GlobalExceptionHandler {

    /**
     * @param ex validation exception.
     * @return ResponseEntity.
     */
    @ExceptionHandler(value = ValidationException.class)
    protected ResponseEntity<Object> handleConflict(final ValidationException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("message", ex.getMessage());
        return ResponseEntity.status(400).body(response);
    }

}
