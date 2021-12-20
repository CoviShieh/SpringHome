package com.kuang.demo1;

/**
 * @author xiewh
 * @create 2021-12-17 9:49
 * @Description
 */
public class test {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理实例的调用处理程序
        ProxyInvocation proxyInvocation = new ProxyInvocation();

        //将真实角色放置进去！
        proxyInvocation.setTarget(host);

        //动态生成对应的代理类！
        Rent proxy = (Rent)proxyInvocation.getProxy();

        proxy.rent();

    }
}
