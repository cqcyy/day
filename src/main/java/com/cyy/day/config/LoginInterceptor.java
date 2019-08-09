package com.cyy.day.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

            return false;
        }
    }

}
