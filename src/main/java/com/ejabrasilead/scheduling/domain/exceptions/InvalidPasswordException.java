package com.ejabrasilead.scheduling.domain.exceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException() {
        super("Password must be at least 8 characters long, contain an uppercase letter, a lowercase letter, a number, and a special character.");
    }
    
}
