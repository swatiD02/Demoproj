package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String loadform(Model model) {	
		model.addAttribute("msg", "welcome to hell");
		return "index";
	}

}
