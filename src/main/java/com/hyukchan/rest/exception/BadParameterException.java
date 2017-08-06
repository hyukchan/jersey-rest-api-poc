package com.hyukchan.rest.exception;

import com.hyukchan.rest.exception.errors.items.ErrorItem;
import com.hyukchan.rest.exception.errors.items.RootErrorItem;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class BadParameterException extends WebApplicationException {

    public BadParameterException() {
        super(Response.status(Response.Status.BAD_REQUEST)
                      .build());
    }

    public BadParameterException(List<ErrorItem> errorItems) {
        super(Response.status(Response.Status.BAD_REQUEST)
                      .entity(new RootErrorItem(Response.Status.BAD_REQUEST.getStatusCode(),
                              "Bad request",
                              errorItems))
                      .type(MediaType.APPLICATION_JSON)
                      .build());
    }
}
