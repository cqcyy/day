package com.cyy.day.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/day")
public class TestDockerController {
   private static final Logger logger = LoggerFactory.getLogger(TestDockerController.class);
    @RequestMapping(value = "/success",method={RequestMethod.GET})
    public Object success() {
        Map map = new HashMap();
        map.put("success", "获取数据成功！");
        return map;
    }
}
