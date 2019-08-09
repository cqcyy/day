package com.cyy.day.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/day")
public class TestController {
   private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping(value = "/success",method={RequestMethod.GET})
    public Object success() {
        Map map = new HashMap();
        map.put("success", "获取数据成功！");
        return map;
    }
}
