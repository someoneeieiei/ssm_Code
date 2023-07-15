package com.qf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/returnString")
    public String returnString(){
        System.out.println("returnString 。。。。 isRunning");
        return "success";
    }

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response){
        System.out.println("returnString 。。。。 isRunning");
    }

    @RequestMapping("/returnForward")
    public String returnForward(Model model){
        System.out.println("returnForward 。。。。 isRunning");
        model.addAttribute("msg","美眉");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/returnRedirect")
    public String returnRedirect(){
        System.out.println("returnForward 。。。。 isRunning");
//        return "redirect:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }

    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","美眉");
        mav.addObject("age","18");
        mav.setViewName("success");
        return mav;
    }
}
