package com.practice.exception;

public class UnsupportedClassException extends RuntimeException {
    public UnsupportedClassException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
