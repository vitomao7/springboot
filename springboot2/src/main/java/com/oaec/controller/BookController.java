package com.oaec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oaec.mapper.BooksMapper;
import com.oaec.pojo.Books;
import com.oaec.service.IBookService;

@Controller
public class BookController {
	@Autowired
	private IBookService bookService;
	
	
	
	@RequestMapping("/index.do")
	public String index(Map<String,Object> map){
		List<Books> books = bookService.selectAllBooks();
		System.out.println(books);
		map.put("books", books);
		return "index";
	}
}
