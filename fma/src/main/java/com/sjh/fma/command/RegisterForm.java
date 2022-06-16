package com.sjh.fma.command;

import lombok.Data;

@Data
public class RegisterForm {
    private String id;
    private String pw;
    private String pwCheck;
    private String name;
}
