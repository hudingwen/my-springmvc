package com.hudingwen.controller.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName:ProjectInterceptorHandler
 * Package:com.hudingwen.controller.Interceptor
 * Description:SpringMvc拦截器,对认证等拦截
 * Date:2022-10-06 10:26:54
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@Component
public class ProjectInterceptorHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Content-Type:"+request.getHeader("Content-Type"));

        System.out.println("preHandle...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
