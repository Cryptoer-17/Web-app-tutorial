package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	//nees a controller method to show the initial html form
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller method to process the html form
	@RequestMapping("/processForms")
	public String processForm() {
		return "helloworld";
	}
	
	
	//new a controller method to read form  data and
	//add data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from the HTML form
		String theName=request.getParameter("studentName");
		
		//convert data to all caps
		theName= theName.toUpperCase();
		
		//creat the message
		String result = "Yo! " + theName;
		
		
		//add message to the model
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		
		
		
		//convert data to all caps
		theName= theName.toUpperCase();
		
		//creat the message
		String result = "Hey My Friend v3! " + theName;
		
		
		//add message to the model
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
}
