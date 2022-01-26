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

	//스프링에는 JSP를 직접 호출하지 않는다. 
	//WEB-INF 폴더는 url로 접근 불가
	@RequestMapping(value="/score", method=RequestMethod.GET)
	public String score() {
		return "/homework/score";
	}
	
	//Model 바구니는 반드시 가져와야 한다.
	@RequestMapping(value="/score_proc", method=RequestMethod.POST)
	public String score_proc(Student student, Model model) {
		int total = Integer.parseInt(student.getKor()) + Integer.parseInt(student.getEng()) + Integer.parseInt(student.getMat()); 
		int avg =  total / 3;
		
		//String result = String format("%s님의 총점은 %d점이고, 평균은 %.2f점입니다.", name, total, avg);
		String result = student.getName() +"님의 총점은 " + total + "점이고, 평균은 " + avg + "점입니다.";
		
		//Model model - request객체에 값을 전달하기 위한 클래스
		//request.setAttribute와 동일한 기능이다.
		//JSP 페이지에 값을 전달하는 객체이다. 
		model.addAttribute("res", result);
		 
		return "/homework/score_proc";
	}
	
}
