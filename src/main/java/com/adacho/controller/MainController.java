package com.adacho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MainController {
	@GetMapping
	public String intro(Model model) {
		model.addAttribute("greeting", "Hello, Server3");
		return "hello";
	}
}
