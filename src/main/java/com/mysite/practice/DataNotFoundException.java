package com.mysite.practice;

public class DataNotFoundException extends RuntimeException{
    private static final long serialVersionUTD = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
