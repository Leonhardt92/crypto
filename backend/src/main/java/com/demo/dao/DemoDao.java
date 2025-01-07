package com.demo.dao;

import com.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@Mapper
public interface DemoDao {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User select(int id);

    @Insert("insert into user(name, age, id) VALUES (#{name}, #{age}, #{id})")
    int insert(User user);

    @Update("update user set name=#{name} where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{id}")
    int delete(int id);

    @Select("<script>SELECT * FROM user WHERE " +
            "id in <foreach collection='ids' item='item' index='index' open='(' close=')' separator=','>#{item}</foreach>" +
            "</script>")
    List<User> selectIds(@Param("ids") Set<String> ids);
}
