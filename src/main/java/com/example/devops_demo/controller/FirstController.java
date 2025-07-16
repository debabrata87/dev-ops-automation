
package com.example.devops_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println(System.getProperty("java.version"));
		return " Hello World , My First Demo for Dev Ops";
	}

}
