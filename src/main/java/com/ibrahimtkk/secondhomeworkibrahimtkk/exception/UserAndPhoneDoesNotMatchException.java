package com.ibrahimtkk.secondhomeworkibrahimtkk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserAndPhoneDoesNotMatchException extends RuntimeException {

    public UserAndPhoneDoesNotMatchException(String message) {
        super(message);
    }
}
