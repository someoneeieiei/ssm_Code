package com.qf.web.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/word")
//@Controller
@RestController
public class WordController {

    @RequestMapping("/returnJsonUser")
    @ResponseBody
    public User returnJsonUser(){
        User user = new User();
        user.setId(10);
        user.setName("sjfd");
        user.setAddress("上海");
        return user;
    }

    @RequestMapping("/returnJsonListUser")
    @ResponseBody
    public List<User> returnJsonListUser(){
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            User user = new User();
            user.setId(i);
            user.setName("sjfd");
            user.setAddress("上海");
            list.add(user);
        }
        return list;
    }

    @RequestMapping("/returnJsonToPojo")
//    @ResponseBody
    public User returnJsonToPojo(@RequestBody User user){
       user.setName("superBaby");
        System.out.println(user);
        return user;
    }
}
