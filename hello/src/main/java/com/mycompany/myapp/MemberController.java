package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class MemberController {

	@RequestMapping(value="/login_form", method=RequestMethod.GET)
	public String login_form() //페이지 이동용
	{
		return "member/login_form";
	}
	
	@RequestMapping(value="/login_proc", method=RequestMethod.POST)
	public String login_proc(String userid, String password, Model model)
	{
		System.out.println("사용자아이디 : " + userid);
		System.out.println("사용자비밀번호 : " + password);
		
		if( userid.equals("test") && password.equals("1234"))
			model.addAttribute("result",  "login 성공");
		else
			model.addAttribute("result",  "login 실패");
		
		return "member/login_result";
	}
	
}







