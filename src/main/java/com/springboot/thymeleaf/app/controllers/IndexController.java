package com.springboot.thymeleaf.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${application.controllers.message}")
	private String message;
	
	@GetMapping("/") // Si es una petición GET
	public String greeting(Model model) {
		model.addAttribute("message", message);
		return "hello";
	}
}
