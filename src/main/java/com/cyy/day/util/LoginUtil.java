package com.cyy.day.util;

import com.cyy.day.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
    public static boolean isLogin() {
        HttpSession session = getSession();
        User seesion_user = (User) session.getAttribute("user");
        if (seesion_user == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void login(User user) {
        HttpSession session = getSession();
        session.setAttribute("user",user);
    }

    public static HttpSession getSession() {
        return getRequest().getSession();
    }
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        return requestAttributes.getRequest();
    }

}
