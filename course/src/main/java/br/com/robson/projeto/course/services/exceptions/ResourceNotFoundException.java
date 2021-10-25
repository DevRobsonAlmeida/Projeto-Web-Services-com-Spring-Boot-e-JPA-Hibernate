/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.robson.projeto.course.services.exceptions;

/**
 *
 * @author robson-pc
 */
public class ResourceNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public ResourceNotFoundException(Object id){
        super("Resouce not found. Id " + id);
    }
    
}
