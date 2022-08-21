package com.stream.setuphelper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users/panel")
    public String panel() {
        return "panel";
    }

}
