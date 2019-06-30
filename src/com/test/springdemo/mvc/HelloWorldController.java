package com.test.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processformv2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName").toUpperCase();
		model.addAttribute("message", "Yo! "+name);
		return "helloworld";
	}
	
	@RequestMapping("/processformv3")
	public String processFormV3(@RequestParam("studentName") String name, Model model) {
		 name = name.toUpperCase();
		model.addAttribute("message", "hello	! "+name);
		return "helloworld";
	}
}
