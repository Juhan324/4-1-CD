package com.sjh.fma.controller;

import java.util.List;

import com.sjh.fma.model.User;
import com.sjh.fma.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public String AllUser(Model model) {
        List<User> allUser = userService.getAllUsers();
        model.addAttribute("userlist", allUser);
        return "users";
    }
}