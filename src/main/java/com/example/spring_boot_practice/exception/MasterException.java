package com.example.spring_boot_practice.exception;

public class MasterException extends RuntimeException{
    public MasterException() {
    }
    public MasterException(String message) {
        super(message);
    }

}
