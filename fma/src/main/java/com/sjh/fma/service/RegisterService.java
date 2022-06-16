package com.sjh.fma.service;

import com.sjh.fma.command.RegisterForm;
import com.sjh.fma.dao.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private UserMapper userMapper;

    public RegisterService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Boolean register(RegisterForm registerForm){
        if(registerForm.getPw().equals(registerForm.getPwCheck())){
            userMapper.insertUser(registerForm);
            return true;
        }else{
            return false;
        }
    }
}
