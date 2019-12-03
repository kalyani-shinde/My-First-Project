package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.service.ProductService;

@Controller
public class MyController {
@Autowired
	ProductService productService;
@RequestMapping("/")
public String loginpage() {
return "loginpage";
}
@RequestMapping("/Validate")
	public ModelAndView validateUser(@RequestParam("uname")String uname,@RequestParam("upass")String upass) {
	boolean ans=productService.validateUser(uname,upass);
	if(ans) {
		return new ModelAndView("showmsg","uname",uname);
	}
	else {
		return new ModelAndView("redirect:/");
	}
	
}
	
}



