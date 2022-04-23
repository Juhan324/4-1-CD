package com.sjh.fma.controller;

import com.sjh.fma.command.LoginForm;
import com.sjh.fma.model.User;
import com.sjh.fma.service.LoginService;
import com.sjh.fma.web.SessionConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping
	public String getLoginPage(@SessionAttribute(name = SessionConstants.LOGIN_MEMBER, required = false) User user,
            Model model) {
        if(user == null){
            return "/login/loginForm";
        }else {
            return "redirect:";
        }
	}
    
    @PostMapping("/action")
    public String checkLogin(LoginForm loginForm, HttpServletRequest request) {
        User user = loginService.login(loginForm);
        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute(SessionConstants.LOGIN_MEMBER, user);
            return "redirect:";
        } else{
            return "login/loginForm";
        }
    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();   // 세션 날림
        }
        return "redirect:";
    }
}
