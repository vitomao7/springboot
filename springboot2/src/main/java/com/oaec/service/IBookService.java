package com.oaec.service;


import java.util.List;

import com.oaec.pojo.Books;

public interface IBookService {
	
	List<Books> selectAllBooks();
}
