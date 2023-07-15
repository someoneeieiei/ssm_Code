package com.qf.web.controller;

import com.qf.web.pojo.Role;
import com.qf.web.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/hello")
@Controller
@SessionAttributes(names = {"msg"},types = {java.lang.String.class})
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello is running");
        return "success";
    }

    @RequestMapping("/findById")
    public String findById(Integer id){
        System.out.println("findById is running ======>" + id );
        return "success";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("addUser is running ======>" + user);
        return "success";
    }

    @RequestMapping("/addBatchUser")
    public String addBatchUser(Role role){
        System.out.println("addUser is running ======>" + role);
        return "success";
    }

    @RequestMapping("/addBatchUser1")
    public String addBatchUser1(User user){
        System.out.println("addUser is running ======>" + user);
        return "success";
    }

    @RequestMapping("/getServletAPI")
    public String getServletAPI(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        System.out.println(response);
        return "success";
    }

    @RequestMapping("/studyRequestParamAnno")
    public String studyRequestParamAnno(@RequestParam(required = true,name = "pageNum",defaultValue = "1") Integer page,@RequestParam(required = true,name = "pageValue",defaultValue = "5") Integer pageSize){
        System.out.println(page + "------------------" + pageSize);
        return "success";
    }

    @RequestMapping("/find/{id:\\d+}")
    public String find(@PathVariable("id") Integer userId){
        System.out.println("find is running ======>" + userId );
        return "success";
    }

    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue("JSESSIONID") String cookieValue){
        System.out.println("getCookie is running ======>" + cookieValue );
        return "success";
    }

    @RequestMapping("/getCookie1")
    public String getCookie1(@CookieValue("openCookie") String cookieValue){
        System.out.println("getCookie is running ======>" + cookieValue );
        return "success";
    }

    @ModelAttribute
    public void showData(String name){
        System.out.println(name + "=========>showData");
    }

    @RequestMapping("/testPut")
    public String testPut(Model model){
        model.addAttribute("username","lalala");
        model.addAttribute("password","123123");
        model.addAttribute("age",31);
        model.addAttribute("msg","meimei");
        return "success";
    }

    @RequestMapping("/testGet")
    public String testGet(ModelMap model){
        System.out.println(model.get("username")+";"+model.get("password")+";"+model.get("msg"));
        return"success";
    }

    @RequestMapping("/testClean")
    public String complete(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return"success";
    }
}
