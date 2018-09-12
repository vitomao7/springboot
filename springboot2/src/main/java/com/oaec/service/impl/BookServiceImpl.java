package com.oaec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaec.mapper.BooksMapper;
import com.oaec.pojo.Books;
import com.oaec.service.IBookService;


@Service
public class BookServiceImpl implements IBookService{
	@Autowired
	private BooksMapper bookMapper;
	
	
	@Override
	public List<Books> selectAllBooks() {
		// TODO Auto-generated method stub
		return bookMapper.selectAllBooks();
	}

}
