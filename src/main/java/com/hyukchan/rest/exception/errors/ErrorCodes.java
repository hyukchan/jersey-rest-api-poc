package com.hyukchan.rest.exception.errors;

import lombok.Getter;

@Getter
public enum ErrorCodes {
    REQUIRED_VALUE(11),
    WRONG_FORMAT(2);

    private final int errorCode;

    ErrorCodes(int errorCode) {
        this.errorCode = errorCode;
    }
}
