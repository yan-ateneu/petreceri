package com.example.petreceri.exception;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException() {
        super();
    }

    public NoDataFoundException(String message) {
        super(message);
    }
}