package com.ibrahimtkk.secondhomeworkibrahimtkk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CommentByProductIdNotFoundException extends RuntimeException {

    public CommentByProductIdNotFoundException(String productId) {
        super("There are no comments for "+ productId +" product yet. ");
    }
}
