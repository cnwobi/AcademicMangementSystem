package com.academicManagementSystem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

 @RequestMapping("/")
    public String helloWorld(){
        return "home";
    }
}
