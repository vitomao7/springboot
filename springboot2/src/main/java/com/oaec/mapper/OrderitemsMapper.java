package com.oaec.mapper;

import com.oaec.pojo.Orderitems;

public interface OrderitemsMapper {
    int deleteByPrimaryKey(Integer orderitemId);

    int insert(Orderitems record);

    int insertSelective(Orderitems record);

    Orderitems selectByPrimaryKey(Integer orderitemId);

    int updateByPrimaryKeySelective(Orderitems record);

    int updateByPrimaryKey(Orderitems record);
}