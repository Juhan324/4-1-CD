package com.sjh.fma.controller;

import com.sjh.fma.command.RegisterForm;
import com.sjh.fma.service.RegisterService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    RegisterService registerSerivce;

    public RegisterController(RegisterService registerService){
        this.registerSerivce = registerService;
    }

    @RequestMapping("register")
    public String getRegisterPage(){
        return "register";
    }
    
    @RequestMapping("register/action")
    public String register(RegisterForm registerForm){
        if(registerSerivce.register(registerForm)){
            return "redirect:main";
        }else{
            return "register";
        }
    }
}
