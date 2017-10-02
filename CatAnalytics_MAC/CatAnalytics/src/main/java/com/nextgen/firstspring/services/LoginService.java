package com.nextgen.firstspring.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextgen.firstspring.model.User;

@Service
public class LoginService {

	@Autowired
	UserService UserService;
	
	public User isValidUser(String user , String pass)
	{
		User userObj = UserService.getUser(user, pass);
		if( userObj != null)
		{
			return userObj;
		}
		
		return null;
		//return user.equalsIgnoreCase("sakib") && pass.equals("sakib");
	}
	
	
}
