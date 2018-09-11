package com.oaec.mapper;

import com.oaec.pojo.Rights;

public interface RightsMapper {
    int deleteByPrimaryKey(Integer rightId);

    int insert(Rights record);

    int insertSelective(Rights record);

    Rights selectByPrimaryKey(Integer rightId);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);
}