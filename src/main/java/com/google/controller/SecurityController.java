package com.google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/home")
	public String getHome() {
		return "This is SBI Home Page";

	}

	@GetMapping("/contact")
	public String getContact() {
		return "This is SBI Contact Page";

	}

	@GetMapping("/about")
	public String getAbout() {
		return "This is SBI About Us Page";

	}

}
