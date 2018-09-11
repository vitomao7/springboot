package com.oaec.mapper;

import com.oaec.pojo.Carts;

public interface CartsMapper {
    int deleteByPrimaryKey(Integer cartid);

    int insert(Carts record);

    int insertSelective(Carts record);

    Carts selectByPrimaryKey(Integer cartid);

    int updateByPrimaryKeySelective(Carts record);

    int updateByPrimaryKey(Carts record);
}