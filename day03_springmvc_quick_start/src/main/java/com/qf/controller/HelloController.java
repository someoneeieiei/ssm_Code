package com.qf.controller;

import com.qf.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@Controller
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello() throws CustomException {
        try {
            System.out.println("sayHello.....");
        } catch (Exception e) {
            throw new CustomException("服务器出错了。。。宝气");
        }
        return "success";
    }
}
