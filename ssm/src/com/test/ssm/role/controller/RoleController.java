package com.test.ssm.role.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.ssm.role.model.Role;
import com.test.ssm.role.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/findAllRole")
	public String findAllRole(HttpServletRequest request) {
		List<Role> listRole = roleService.findAllRole();
		request.setAttribute("listRole", listRole);
		return "/showRole";
	}
}
