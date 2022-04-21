package com.sjh.fma.model;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class User {
    private String id;
    private String pw;
    private String name;
    private String auth;

    public boolean matchPassword(String pw){
        return this.getPw().equals(pw);
    }
}
