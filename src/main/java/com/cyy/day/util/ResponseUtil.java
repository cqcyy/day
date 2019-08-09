package com.cyy.day.util;

import com.cyy.day.vo.ResponseVo;

public class ResponseUtil {

    public static ResponseVo ok(Object data) {
        return ok(200, null, data);
    }
    public static ResponseVo ok(int code,String msg) {
        return ok(code, msg,null);
    }public static ResponseVo ok(String msg,Object data) {
        return ok(200, msg, data);
    }
    public static ResponseVo ok(int code, String msg,Object data) {
        ResponseVo result = new ResponseVo();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
