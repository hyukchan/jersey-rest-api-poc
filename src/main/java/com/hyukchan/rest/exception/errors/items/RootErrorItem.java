package com.hyukchan.rest.exception.errors.items;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Getter
@Setter
@XmlType(name = "")
public class RootErrorItem extends ErrorItem {

    private List<ErrorItem> errors;

    public RootErrorItem() {
    }

    public RootErrorItem(Integer code, String message, List<ErrorItem> errors) {
        super(code, message);
        this.errors = errors;
    }
}
