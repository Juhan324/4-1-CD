package com.sjh.fma.dao;

import java.util.List;

import com.sjh.fma.model.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findByUserId(@Param("id") String id);

    @Insert("INSERT INTO user(id,pw,name) VALUES(#{id}, #{pw}, #{name}")
    void insertUser(@Param("user") User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUser(@Param("id") String id);
}