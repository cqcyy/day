package com.cyy.day.controller;

import com.cyy.day.entity.User;
import com.cyy.day.util.LoginUtil;
import com.cyy.day.util.ResponseUtil;
import com.cyy.day.vo.ResponseVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/day")
public class LoginController {
    @RequestMapping(value = "login",method={RequestMethod.GET})
    public ResponseVo login(@RequestBody User user) {
        LoginUtil.login(user);
        return ResponseUtil.ok("登陆成功");
    }
}
