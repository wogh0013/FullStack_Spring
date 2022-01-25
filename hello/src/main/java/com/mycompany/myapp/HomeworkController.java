package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeworkController {
	
	// localhost:8080/myapp/myname?username=xxx
	@RequestMapping(value="/myname", method=RequestMethod.GET)
	public String myname(String username, Model model) {
		model.addAttribute("result", username);
		return "/homework/myname";
	}
	
	@RequestMapping(value="/gugudan", method=RequestMethod.GET)
	public String gugudan(int dan, Model model) {
		String result="";
		for(int i=2; i<=9; i++)
		{
			result = result + String.format("%d X %d = %d<br/>", dan, i, dan*i);
		}
		
		model.addAttribute("bongtoo", result);
		return "/homework/gugudan";
	}

	@RequestMapping(value="/score", method=RequestMethod.GET)
	public String score() {
		return "/homework/score";
	}
	
	@RequestMapping(value="/score_proc", method=RequestMethod.POST)
	public String score_proc(Student student, Model model) {
		int total = Integer.parseInt(student.getKor()) + Integer.parseInt(student.getEng()) + Integer.parseInt(student.getMat()); 
		int avg =  total / 3;
		
		String result = student.getName() +"님의 총점은 " + total + "점이고, 평균은 " + avg + "점입니다.";
		
		model.addAttribute("res", result);
		 
		return "/homework/score_proc";
	}
	
}
