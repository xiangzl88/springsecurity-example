package com.fulinlin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: spring-seruirty
 * @author: Fulin
 * @create: 2019-05-13 16:41
 **/
@Controller
@RequestMapping
public class TestController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("11111");
        System.out.println("11111");
        System.out.println("11111");
        System.out.println("11111");
        System.out.println("11111");
        return "login";
    }
}
