package com.kuang.pojo;

/**
 * @author xiewh
 * @create 2021-12-15 13:44
 * @Description
 */
public class Hello {
    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

}
