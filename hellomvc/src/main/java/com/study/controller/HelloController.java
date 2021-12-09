package com.study.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xiewh
 * @create 2021-12-07 15:20
 * @Description 初识springmvc
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        //模型与视图
        ModelAndView view = new ModelAndView();
        //业务代码 封装代码，放在ModelAndView中
        view.addObject("msg","hellopringmvc");
        //跳转指定的jsp页面
        view.setViewName("hello");

        return view;
    }
}
