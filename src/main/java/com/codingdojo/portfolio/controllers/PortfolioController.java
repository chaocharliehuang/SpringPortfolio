package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortfolioController {
	
	@RequestMapping("")
	public String index() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "forward:/myprojects.html";
	}
	
	@RequestMapping("/me")
	public String aboutme() {
		return "forward:/aboutme.html";
	}
}
