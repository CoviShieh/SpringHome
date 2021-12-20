package com.kuang.demo1;

/**
 * @author xiewh
 * @create 2021-12-17 9:35
 * @Description
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东做出租这个动作");
    }
}
