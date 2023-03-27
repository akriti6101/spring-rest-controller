package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.User;

@RestController
public class MyRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/message")
	public String message() {
		return "Hello World!";
	}
	@GetMapping("/showData")
	public String showData(Model model) {
		List<User> users=userService.showData();
		String stUsers="";
		for(User user: users) {
			stUsers=stUsers+"<br/>"+user;
		}
		return "Registration List !! <br/><br/>"+stUsers;
	}
}
