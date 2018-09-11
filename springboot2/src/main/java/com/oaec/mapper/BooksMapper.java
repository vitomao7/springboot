package com.oaec.mapper;

import java.util.List;

import com.oaec.pojo.Books;

public interface BooksMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);
    
    //自己写的方法
    
    List<Books> selectAllBooks();
}