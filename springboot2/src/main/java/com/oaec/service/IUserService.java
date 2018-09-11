package com.oaec.service;

import com.oaec.pojo.Users;

public interface IUserService {
	
	Users login(String name,String pwd);
}
