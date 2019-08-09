package com.cyy.day.config;

import com.cyy.day.exception.LoginException;
import com.cyy.day.util.LoginUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Value(value = "${isValidateLogin}")
    boolean isValidateLogin;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        if (isValidateLogin) {
            return true;
        } else {
            //校验登陆
            HttpSession session = request.getSession();
            String id = session.getId();
            System.out.println("SessionId:"+id);
            boolean login = LoginUtil.isLogin();
            System.out.println("login:"+login);
            throw new LoginException(4001,"没有登陆",null);
        }
    }

}
