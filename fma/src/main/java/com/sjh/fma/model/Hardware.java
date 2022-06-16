package com.sjh.fma.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hardware {
    public Hardware(int speed, int error, int output) {
        this.speed=speed;
        this.error=error;
        this.output=output;
    }
    private int id;
    private int speed;
    private int error;
    private int output;
}
