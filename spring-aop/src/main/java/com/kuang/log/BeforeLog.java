package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xiewh
 * @create 2021-12-17 10:54
 * @Description
 */
public class BeforeLog implements MethodBeforeAdvice {

    //method: 要执行的目标对象的方法
    //args : 被调用的方法的参数
    //target : 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("前置通知："+target.getClass().getName()+"--"+method.getName()+"准备执行");
    }
}
