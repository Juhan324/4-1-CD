package com.sjh.fma.model;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class User {
    private String id;
    private int pw;
    private String name;
    private String auth;
}
