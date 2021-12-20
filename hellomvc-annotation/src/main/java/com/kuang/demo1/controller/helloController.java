package com.kuang.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiewh
 * @create 2021-12-09 16:11
 * @Description
 */

/*
    @Controller最后会找到视图解析器再返回
    @RestController只会返回字符串，适合返回json
 */
@Controller

public class helloController {

    @RequestMapping("/hi")
    public String hello(Model model){

        model.addAttribute("msg","this is my world!");

        return "hello";
    }
}
