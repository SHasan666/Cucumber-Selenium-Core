package com.van.catanalytics.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	@RequestMapping("/login")
	public String login()
	{
		
		return "login";
	}
	/*
	@RequestMapping("/")
	public String loginHome()
	{
		
		return "login";
	}*/
	@RequestMapping("/")
	public String loginHome()
	{
		
		return "analytics";
	}
	
}
