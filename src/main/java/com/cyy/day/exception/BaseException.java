package com.cyy.day.exception;

import lombok.Data;

@Data
public class BaseException extends RuntimeException {
    private String msg;
    private String expPath;
    private int code;

}
