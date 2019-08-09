package com.cyy.day.config;

import com.cyy.day.exception.BaseException;
import com.cyy.day.util.ResponseUtil;
import com.cyy.day.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalHandleException  {
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ResponseVo handle(BaseException e) {
        return ResponseUtil.ok(e.getCode(),e.getMsg()+e.getExpPath());
    }
}
