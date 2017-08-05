package com.hyukchan.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Property {
    private String key;
    private String value;

    public Property() {
    }

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
