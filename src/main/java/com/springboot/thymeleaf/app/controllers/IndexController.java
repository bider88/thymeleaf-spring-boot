package com.springboot.thymeleaf.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/") // Si es una petición GET
	public String greeting(Model model) {
		model.addAttribute("message", "Hello World from Spring Framework and Thymeleaf");
		return "hello";
	}
}
