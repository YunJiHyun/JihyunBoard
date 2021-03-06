package com.naver.jihyunboard.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naver.jihyunboard.user.dto.UserDTO;
import com.naver.jihyunboard.user.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	 public String login() {
		return "/user/login";
	}
	
	@RequestMapping("/loginCheck") //ModelAndView 이용, return 2번말고 setViewName이용하려고
	public ModelAndView loginCheck(@ModelAttribute UserDTO dto, HttpSession session){
		
		boolean result = userService.loginCheck(dto, session);
		
		ModelAndView mv = new ModelAndView();
		
		if(result == true) {
			//로그인 성공
			mv.addObject("result","성공");
			mv.setViewName("/board/list");
		} else {
			mv.addObject("result","실패");
			mv.setViewName("redirect:login");
		}
		
		return mv;
		
	}
	
	@RequestMapping("/register")
	 public String register() {
		return "/user/register";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addUser")
	public String addUser(@ModelAttribute UserDTO dto) {
		userService.registerUser(dto);
		return "redirect:login";
	}

}
