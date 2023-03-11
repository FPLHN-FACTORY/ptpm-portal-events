package com.portalevent.infrastructure.exeption.rest;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author SonPT
 */
@RestControllerAdvice
public final class UnknownExceptionRestHandler extends
        FpolyDatnExceptionRestHandler<Exception> {

    @Override
    protected Object wrapApi(Exception ex) {
        return ex.getMessage();
    }
}

