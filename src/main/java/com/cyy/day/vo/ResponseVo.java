package com.cyy.day.vo;

import lombok.Data;

@Data
public class ResponseVo {
    private int code;
    private String msg;
    private Object data;
}
