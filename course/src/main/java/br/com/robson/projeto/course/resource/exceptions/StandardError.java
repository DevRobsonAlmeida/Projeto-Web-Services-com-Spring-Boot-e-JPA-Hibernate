/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.robson.projeto.course.resource.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.Instant;

/**
 *
 * @author robson-pc
 */
public class StandardError implements Serializable{
    private static final long serialVerionUID = 1L;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss'Z'", timezone = "GMT")
    private Instant timetamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timetamp, Integer status, String error, String message, String path) {
        this.timetamp = timetamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Instant timetamp) {
        this.timetamp = timetamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
     
    
}
