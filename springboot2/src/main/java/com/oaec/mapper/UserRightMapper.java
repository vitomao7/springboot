package com.oaec.mapper;

import com.oaec.pojo.UserRight;

public interface UserRightMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    UserRight selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}