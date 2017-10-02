package com.nextgen.firstspring.controllers;



import org.json.JSONException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextgen.firstspring.helpers.XLS_List_HashMap;


@RestController
public class EffortController {
	
	@CrossOrigin
	@GetMapping("/getAllEffort")
	public String getAllEffort() throws JSONException 
	{
		//(origins = "http://127.0.0.1:3000")
		String efforMatrixPath = "/Users/sakib/Downloads/Efforts Matrix.xlsx";
		String sheetYear = "2017";
		String weekOfTheMonthPointer = "p";
		return XLS_List_HashMap.getAllEffortsByProject(efforMatrixPath , sheetYear , weekOfTheMonthPointer);
		 
	}
	
	
}
