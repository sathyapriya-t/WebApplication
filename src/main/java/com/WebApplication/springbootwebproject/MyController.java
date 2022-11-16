package com.WebApplication.springbootwebproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("pages")
    public String  show(){
//        System.out.println("hello.......");
        return "pages";
    }
}
