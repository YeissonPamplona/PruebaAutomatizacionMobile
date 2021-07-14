package com.sistecredito.pruebadafiti.exceptions;

public class MensajeExceptions extends AssertionError {

    public MensajeExceptions(String mensajeError, Throwable cause) {
        super(mensajeError, cause);
    }
}
