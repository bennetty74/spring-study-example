package com.bennetty74.mapper;

import com.bennetty74.bean.ExampleUserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author bennetty74
 * @date 2021.9.12
 */
@Mapper
@Repository
public interface ExampleUserDetailMapper {

    /**
     * select a user by username
     * @param username an unique username in user table
     * @return a user if exist, else return null
     */
    @Select("select * from user where username=#{username}")
    ExampleUserDetail selectByUsername(String username);

}
