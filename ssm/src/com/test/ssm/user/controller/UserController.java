package com.test.ssm.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.ssm.user.model.User;
import com.test.ssm.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findAllUser")
	public String findAllUser(HttpServletRequest request) {
		List<User> listUser = userService.findAllUser();
		request.setAttribute("listUser", listUser);
		return "/show";
	}
}
