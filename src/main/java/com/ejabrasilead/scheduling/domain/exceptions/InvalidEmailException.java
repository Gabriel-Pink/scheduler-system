package com.ejabrasilead.scheduling.domain.exceptions;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String email) {
        super("Invalid e-mail: " + email);
    }
}
