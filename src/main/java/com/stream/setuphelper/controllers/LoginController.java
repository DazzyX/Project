package com.stream.setuphelper.controllers;

import com.stream.setuphelper.models.dtos.UserLoginDTO;
import com.stream.setuphelper.models.dtos.UserRegisterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/users/login")
    public String login() {
        return "login";
    }

    @PostMapping("/users/login")
    public String login(UserLoginDTO userLoginDTO) {
        return "redirect:/";
    }
}
