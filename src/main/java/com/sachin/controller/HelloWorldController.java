package com.sachin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String sayHello (Model model){
		model.addAttribute("greeting", "Are mere yaaron");
		
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String sayRegister(HttpServletRequest request, HttpServletResponse response){
		
		System.err.println("It is coming inside this");
		return "studentDetails";
	}
}
