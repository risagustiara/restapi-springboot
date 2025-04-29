package com.satusehat.satusehat_restapi.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {

    private String service;
    private String message;
    private T data;
}
