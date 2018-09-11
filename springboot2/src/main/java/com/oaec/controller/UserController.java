package com.oaec.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oaec.pojo.Users;
import com.oaec.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/loginS.do")
	public String loginS(){
		return "login";
	}
	
	
	@RequestMapping("/login.do")
	public String login(HttpSession session,String userName,String userPwd){
		
		Users user = userService.login(userName, userPwd);
		if(user!=null){
			session.setAttribute("user", user);
			return "forward:index.do";
		}else{
			return "login";
		}
		
	}
}
