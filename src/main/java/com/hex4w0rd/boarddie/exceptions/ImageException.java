package com.hex4w0rd.boarddie.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ImageException extends RuntimeException{

    private final HttpStatus httpStatus;

    public ImageException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

}
