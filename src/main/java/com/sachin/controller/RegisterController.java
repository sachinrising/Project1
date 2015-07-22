package com.sachin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerControll(HttpServletRequest request, HttpServletResponse response) {

		return "studentRegistration";
	}
}
