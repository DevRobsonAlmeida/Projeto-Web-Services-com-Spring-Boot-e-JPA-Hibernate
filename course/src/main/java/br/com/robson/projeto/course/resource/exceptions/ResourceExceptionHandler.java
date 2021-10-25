/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.robson.projeto.course.resource.exceptions;

import br.com.robson.projeto.course.services.exceptions.DataBaseException;
import br.com.robson.projeto.course.services.exceptions.ResourceNotFoundException;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author robson-pc
 */
// Intercepta as exceções
@ControllerAdvice
public class ResourceExceptionHandler {
    
    //A anotação irá interceptar qualquer ação vinda da classe.
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
    
    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> dataBase(DataBaseException e, HttpServletRequest request){
        String error = "DataBase error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
