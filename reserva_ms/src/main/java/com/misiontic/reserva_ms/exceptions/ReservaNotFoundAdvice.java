package com.misiontic.reserva_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
@ResponseBody

public class ReservaNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ReservaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(ReservaNotFoundException ex){
        return  ex.getMessage();
    }

}
