package com.salesianostriana.dam.rest.security.errorhandling;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.servlet.HandlerExceptionResolver;

@Component
@RequiredArgsConstructor
public class PasswordNotMatchingException extends RuntimeException {

    public PasswordNotMatchingException(String msg) {
        super(msg);
    }
}
