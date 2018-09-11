package com.oaec.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.oaec.pojo.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    //自己写的方法
    Users login(@Param("name")String name,@Param("pwd")String pwd);
    
    
}