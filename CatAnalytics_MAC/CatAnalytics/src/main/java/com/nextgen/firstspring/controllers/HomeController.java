package com.nextgen.firstspring.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.nextgen.firstspring.model.User;
import com.nextgen.firstspring.services.LoginService;
import com.nextgen.firstspring.services.UserService;

@Controller
@SessionAttributes("user")
public class HomeController {

	@Autowired
	LoginService loginService;
	@Autowired
	UserService UserService;
	
	
	@RequestMapping( value="/home" , method=RequestMethod.POST)
	public String login(@RequestParam String name ,@RequestParam String psw , ModelMap model)
	{
		System.out.println(name);
		User userObj = loginService.isValidUser(name, psw);
		
		if(userObj != null)
		{			
			model.put("name", userObj.getFirstName());
			System.out.println(name);
			System.out.println((String) model.get(name));
			model.put("user", userObj.getUsername());
			
			System.out.println((String) model.get("user"));
			
			//model.put("psw", psw);
			System.out.println("Printing from HomeControllerController "+(String) model.get("user"));
			return "home";
		}else
		{
			model.put("errorMsg", "<div class=\"alert alert-danger\" style=\"margin-top:10px;\" role=\"alert\">Invalid username/password!</div>");
			return "login";
		}
		
		
		
		
	}
	
	
	@RequestMapping( value="/RegisterUser" , method=RequestMethod.POST)
	public String register(@RequestParam String firstName ,@RequestParam String lastName ,@RequestParam String email ,@RequestParam String password, @RequestParam String phone ,@RequestParam String address,ModelMap model)
	{
		System.out.println(firstName +lastName + email + password + phone + address);
		
		
		if(!UserService.findUser(email))
		{	
			UserService.addUser(email, password, firstName, lastName, phone, address);
			
			model.put("alreadyUserOrSucessMsg", "<div class=\"alert alert-success\" style=\"margin-top:10px;\" role=\"alert\">Thank you for registering! Please sign in!</div>");
			return "login";
		}else
		{
			model.put("alreadyUserOrSucessMsg", "<div class=\"alert alert-warning\" style=\"margin-top:10px;\" role=\"alert\">You are a member already! Please sign in!</div>");
			return "login";
		}
		
		
		
		
	}
	
	
	
}
