package com.sjh.fma.service;

import com.sjh.fma.command.LoginForm;
import com.sjh.fma.dao.UserMapper;
import com.sjh.fma.model.User;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private UserMapper userMapper;

    public LoginService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public User login(LoginForm loginForm){
        User user = userMapper.findByUserId(loginForm.getId());
        if(user.matchPassword(loginForm.getPw())){
            return user;
        }
        return null;
    }
}
