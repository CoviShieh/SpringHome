package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author xiewh
 * @create 2021-12-17 10:54
 * @Description
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("后置通知："+target.getClass().getName()+"--"+method.getName()+"方法，返回值："+returnValue);

    }
}
