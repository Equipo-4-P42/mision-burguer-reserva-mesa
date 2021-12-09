package com.misiontic.reserva_ms.exceptions;

public class ReservaNotFoundException extends RuntimeException {
    public ReservaNotFoundException(String message){
        super(message);
    }
}
