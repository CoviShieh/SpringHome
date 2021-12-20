package com.kuang.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiewh
 * @create 2021-12-17 9:36
 * @Description 动态代理类
 */
public class ProxyInvocation implements InvocationHandler {

    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    //生成代理类--固定写法
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader() //目标对象使用的类加载器
                    ,target.getClass().getInterfaces(), //目标对象实现的所有接口
                this); //执行代理对象方式时触发
    }

    //我这边要把个人的事情处理好，最快到岗时间要下个月4号了。
    //需要重写此方法，处理代理实例并且返回结果
    //参数
    //proxy - 调用该方法的代理实例
    //method -代理类的调用处理程序的方法对象.
    //args -包含的方法调用传递代理实例的参数值的对象的阵列，或null如果接口方法没有参数。原始类型的参数包含在适当的原始包装器类的实例中，例如java.lang.Integer或java.lang.Boolean 。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void log(String methodName){

        System.out.println("执行了"+methodName+"方法");

    }















}
