package com.javatechnolessons.demo.service.exception;

public class ProjectNotFoundException extends RuntimeException{

    public ProjectNotFoundException(Long id, Throwable cause) {
        super("Project with id="+id+ " not found", cause);
    }

    public ProjectNotFoundException(String name, Throwable cause) {
        super("Project with name="+name+ " not found", cause);
    }
 
}
