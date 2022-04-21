package com.sjh.fma.controller;

import com.sjh.fma.model.User;
import com.sjh.fma.web.SessionConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class MainController {
    @RequestMapping("/")
    public String main(@SessionAttribute(name = SessionConstants.LOGIN_MEMBER, required = false) User user, 
            Model model) {
        if(user == null){
            return "redirect:/login";
        }else{
            return "main";
        }
    }
    
    
}
