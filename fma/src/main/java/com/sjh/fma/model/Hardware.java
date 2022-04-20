package com.sjh.fma.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hardware {
    private int id;
    private Date time;
    private int speed;
    private int error;
    private int output;
}
