package com.sjh.fma.dao;

import java.util.List;

import com.sjh.fma.model.Hardware;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HardwareMapper {
    @Select("SELECT * FROM hardware")
    List<Hardware> findAll();

    @Insert("INSERT INTO hardware(speed,error,output) VALUES(#{data.speed}, #{data.error}, #{data.output})")
    void insertData(@Param("data") Hardware data);
}
