package com.nba.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class loginAspect {
    @Autowired
    HttpServletRequest request;
    /**
     * 检测是否登录
     */
//    @Around("execution(* com.nba..*Controller.*(..))")
//    public Object checkLogin(ProceedingJoinPoint pjp){
//        if(request.getAttribute("username") != null){
//            try {
//                return pjp.proceed();
//            }catch (Throwable throwable){
//                return "未知错误";
//            }
//        }
//        return "会话过期，请重新登陆";
//    }
}
