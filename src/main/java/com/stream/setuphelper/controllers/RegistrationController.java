package com.stream.setuphelper.controllers;

import com.stream.setuphelper.models.dtos.UserRegisterDTO;
import com.stream.setuphelper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/register")
    public String register() {
        return "register";
    }

    @PostMapping("/users/register")
    public String register(UserRegisterDTO userRegisterDTO) {
        userService.registerAndLogin(userRegisterDTO);

        return "redirect:/";
    }
}
