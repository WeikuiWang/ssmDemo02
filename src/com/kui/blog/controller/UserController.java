package com.kui.blog.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kui.blog.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "userlist.do")
	public String userList(ModelMap modelMap, HttpServletResponse response) {
		modelMap.addAttribute("userList", userService.getAllUser());
		return "/pages/userList.jsp";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	@ResponseBody
	public String login( HttpServletResponse response) {
		System.out.println("login");
//		mav.setViewName("index.html");
		return "1";
	}
}
