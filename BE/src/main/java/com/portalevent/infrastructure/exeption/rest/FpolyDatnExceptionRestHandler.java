package com.portalevent.infrastructure.exeption.rest;

import com.portalevent.infrastructure.exeption.FpolyDatnExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author SonPT
 */
public abstract class FpolyDatnExceptionRestHandler<Z extends Exception>
        extends FpolyDatnExceptionHandler<ResponseEntity<?>,Z> {

    @Override
    protected ResponseEntity<?> wrap(Z ex) {
        return new ResponseEntity<>(wrapApi(ex), HttpStatus.BAD_REQUEST);
    }

    protected abstract Object wrapApi(Z ex);
}