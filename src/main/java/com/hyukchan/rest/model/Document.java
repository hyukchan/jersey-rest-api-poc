package com.hyukchan.rest.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Document {

    private String id;
    private String filename;

    private List<Property> properties;

}
