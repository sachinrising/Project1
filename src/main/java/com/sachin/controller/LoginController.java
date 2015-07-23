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
		model.addAttribute("greeting", "Are mere yaaron");

		return "index";
	}

	@RequestMapping(value = "/" + HtmlRep.HOME_HTML, method = RequestMethod.POST)
	public String checkLogin(Model model, LoginCredentials loginCredentials) {


		System.out.println(loginCredentials);

		return "studentDetails";
	}
}
