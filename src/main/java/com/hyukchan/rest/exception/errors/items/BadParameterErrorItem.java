package com.hyukchan.rest.exception.errors.items;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlType(name = "")
public class BadParameterErrorItem extends ErrorItem {

    private String field;

    public BadParameterErrorItem() {
    }

    public BadParameterErrorItem(Integer code, String message, String field) {
        super(code, message);
        this.field = field;
    }
}
