package com.oaec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaec.mapper.UsersMapper;
import com.oaec.pojo.Users;
import com.oaec.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UsersMapper userMapper;
	@Override
	public Users login(String name, String pwd) {
		// TODO Auto-generated method stub
		return userMapper.login(name, pwd);
	}

}
