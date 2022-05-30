package com.spring.crud.demo.exception;

import java.io.Serializable;

public class RecordNotFoundException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(String message, Throwable t) {
        super(message, t);
    }

    public RecordNotFoundException(int id) {
        super("Record not found. ID->"+id);
    }
}
