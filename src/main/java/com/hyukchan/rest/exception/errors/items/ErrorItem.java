package com.hyukchan.rest.exception.errors.items;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlSeeAlso;

@Getter
@Setter
@XmlSeeAlso({BadParameterErrorItem.class})
public abstract class ErrorItem {
    private Integer code;
    private String message;

    ErrorItem() {
    }

    ErrorItem(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
