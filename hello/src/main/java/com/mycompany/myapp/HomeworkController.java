package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeworkController {
	@RequestMapping("/homework/myname")
	String myname(String username, Model model)
	{	
		model.addAttribute("myname", username);
		return "homework/myname";
	}
	
	
	@RequestMapping("/homework/gugudan")
	String gugudan(int dan, Model model)
	{
		String result="";
		for(int i=1; i<=9; i++)
		{
			result = result + String.format("%d X %d = %d<br/>", dan, i, dan*i);
		}
		
		model.addAttribute("result", result);
		return "homework/gugudan";
	}
	
	
	//스프링에는 JSP 를 직접 호출하지 않는다. WEB-INF 폴더는 url 로 접근불가
	@RequestMapping("/homework/score")
	String score() {
		return "homework/score";
	}
	
	
	@RequestMapping("/homework/score_proc")
	String score_proc(String name, int kor, int eng, int mat, Model model) {
		int total = kor + eng + mat;
		float afv = total/3.0f;
		
		System.out.println(name);
		
		String result = String.format("%s님의 총점은%d 이고 평균은 %.2f입니다",
				name, total, afv);
		model.addAttribute("result", result);//키, 값 추가 , HashMap 과 유사
		//Model model - request객체에 값 전달하기 위한 클래스 
		//request.setAttribute 와 동일하다 
		//JSP페이지에 값 전달용 객체 
		return "homework/score_proc";
	}
	
	
	
}






