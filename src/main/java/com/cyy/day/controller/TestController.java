package com.cyy.day.controller;

import com.cyy.day.util.ResponseUtil;
import com.cyy.day.vo.ResponseVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/day")
public class TestController {
    @RequestMapping(value = "/success",method={RequestMethod.GET})
    public ResponseVo success() {
        return ResponseUtil.ok("获取数据成功！");
    }
}
