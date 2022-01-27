package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//어노테이션 - @Controller 가 있어서 스프링이 읽어서 객체를 만들어준다 
//DispatchServlet 이 컨트롤러를 연결해준다 

@Controller 
public class TestController {
	
	
	//@RequestMapping   - url 하고 컨트롤러의 함수하고 연결한다 
	//@RequestMapping(url) - 전체 사이트에 한개만  
	@RequestMapping("/test")
	String test() {
	
		return "test"; 
		//src/main/webbapp/WEB-INF/views/test.jsp로 포워딩
	}
	
	//jsp  로 이동
	@RequestMapping(value="/calcu", method=RequestMethod.GET)
	String calcu() {
		
		return "calculator";//calculator.jsp가 필요하다
	}
	
	//파라미터값 받아서 더해서 결과를 request객체에 저장한다. 
	//Model model - request 객체임 
	@RequestMapping(value="/calcu_proc", method=RequestMethod.GET)
	String calcu_proc(int x, int y, Model model)
	{
		int result = x + y;
		model.addAttribute("result", result); //jsp에 데이터 전달하기 
		return "calc_proc";
	}
	
	
}






