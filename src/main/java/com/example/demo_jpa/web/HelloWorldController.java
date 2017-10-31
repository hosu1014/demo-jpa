package com.example.demo_jpa.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello.do")
	public String sayHello(Model model) {
		model.addAttribute("name", "your name");
		return "hello";
	}

}
