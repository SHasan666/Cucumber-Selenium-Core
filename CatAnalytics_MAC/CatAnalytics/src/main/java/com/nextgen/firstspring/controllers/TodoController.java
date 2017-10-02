package com.nextgen.firstspring.controllers;




import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.nextgen.firstspring.services.TodoService;

@Controller
@SessionAttributes("user")
public class TodoController {

	@Autowired
	TodoService TodoService;
	
	
	@RequestMapping( value="/list-todos" , method=RequestMethod.GET)
	public String login(ModelMap model)
	{
		//System.out.println("Printing from TodoController "+(String) model.get("user"));
		String currentuser = (String) model.get("user");
		//String json = new Gson().toJson(TodoService.retrieveTodos(currentuser));
		//System.out.println(json);
		model.put("todos", TodoService.retrieveTodos(currentuser));
		
		return "todo";
		
		
	}
	
	@RequestMapping( value="/add-todo" , method=RequestMethod.GET)
	public String showaddToDo(ModelMap model)
	{
		
		return "addToDo";
		
		
	}
	
	@RequestMapping( value="/add-todo" , method=RequestMethod.POST)
	public String addToDo(@RequestParam String desc , ModelMap model)
	{
		TodoService.addTodo((String) model.get("user"), desc, new Date(), false);
		
		return "redirect:/list-todos";
		
		
	}
	
}
