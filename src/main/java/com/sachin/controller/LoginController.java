package com.sachin.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Are mere yaaron");

		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String checkLogin(HttpServletRequest request, HttpServletResponse response) {

		Enumeration<String> enumVal = request.getAttributeNames();

		if (enumVal != null)
			while (enumVal.hasMoreElements()) {
				System.err.println(enumVal.nextElement());
			}
		System.err.println(request.getAttribute("username"));
		System.err.println(request.getAttribute("password"));

		return "studentDetails";
	}
}
