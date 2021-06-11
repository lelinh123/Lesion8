package com.codefresher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codefresher.model.Users;
import com.codefresher.service.UserService;

@Controller
public class UserContronler {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String showAddUserPage(Model model) {
		model.addAttribute("users", new Users());
		return "addUser";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String doAddUser(@ModelAttribute("users") Users users) {
		userService.saveUser(users);
		return "index";
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String getAllUser(Model model) {
		model.addAttribute("userList", userService.getAllUser());
		return "listUser";
	}
}
