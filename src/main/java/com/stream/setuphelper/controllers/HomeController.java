package com.stream.setuphelper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String loggedOutIndex() {
        return "index";
    }

    @GetMapping("/access")
    public String access() {return "access";}
}

