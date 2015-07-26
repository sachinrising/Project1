package com.sachin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sachin.dao.LoginCredentials;
import com.sachin.general.HtmlRep;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String sayHello(Model model) {
		model.addAttribute("loginCredentials", new LoginCredentials());

		return "index";
	}

	@RequestMapping(value = "/" + HtmlRep.HOME_HTML, method = RequestMethod.GET)
	public String loadFromLogin(Model model) {

		model.addAttribute("loginCredentials", new LoginCredentials());
		return "studentDetails";
	}

	@RequestMapping(value = "/" + HtmlRep.HOME_HTML, method = RequestMethod.POST)
	public String checkLogin(Model model) {

		return "studentDetails";
	}
	
	@RequestMapping(value = "/studentRegistration")
	public String getStudentRegistration () {
		return "studentRegistration";
	}
}
