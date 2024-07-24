package com.skkr.shopping.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
public class testController {
    @RequestMapping("/")
    public String test(){
        System.out.println("text 메소드");
        return "index";
    }

    @RequestMapping("/login")
    public String login(){ return "login";}
}
