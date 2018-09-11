package com.oaec.mapper;

import com.oaec.pojo.Addresses;

public interface AddressesMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Addresses record);

    int insertSelective(Addresses record);

    Addresses selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Addresses record);

    int updateByPrimaryKey(Addresses record);
}