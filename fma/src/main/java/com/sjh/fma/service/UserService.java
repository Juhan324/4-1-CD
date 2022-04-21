package com.sjh.fma.service;

import java.util.List;

import com.sjh.fma.dao.UserMapper;
import com.sjh.fma.model.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    // 멤버 전체 조회
    public List<User> getAllUsers() {
        final List<User> userList = userMapper.findAll();
        return userList;
    }
}