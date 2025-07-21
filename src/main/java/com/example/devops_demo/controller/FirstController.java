
package com.example.devops_demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devopsdemo")
public class FirstController {
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println(System.getProperty("java.version"));
		return " Hello World , My First Demo for Dev Ops, Time : "+ new Date();
	}

	
	@GetMapping("/greetv1/{name}")
	public String welcomeV2(@PathVariable("name")  String name) {
		System.out.println(System.getProperty("java.version"));
		return " App Name V1: DevOpsDemo. User Name:" +name +" , Time "+ new Date();
	}
	@GetMapping("/greetv2/{name}")
	public String welcomeV3(@PathVariable("name")  String name) {
		System.out.println(System.getProperty("java.version"));
		return " App Name V2: DevOpsDemo. User Name:" +name +" , Time "+ new Date();
	}
}
