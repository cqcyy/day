package com.cyy.day.exception;

public class LoginException extends BaseException {
    public LoginException(int code,String msg,String expPath) {
        this.setCode(code);
        this.setMsg(msg);
        this.setExpPath(expPath);
    }
}
