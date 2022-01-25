package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//어노테이션 - @Controller가 있어서 스프링이 읽고 객체를 만들어줌.
//DispatchServlet이 컨트롤러를 연결해준다.
@Controller
public class TestController {

	//RequestMapping - url과 컨트롤러의 함수를 연결한다.
	//RequestMapping(url) - 전체 사이트에 한 개만
	@RequestMapping("/test")
	String test() {
		
		return "test"; // src/main/webapp/WEB-INF/views/test.jsp로 포워딩
	}
	
	@RequestMapping(value="/calcu", method=RequestMethod.GET)
	String calcu() {
		
		return "calculator"; //calculator.jsp가 필요.
	}
	
	//파라미터값을 받고 더해서, 결과를 request 객체에 저장한다.
	//Model model - request 객체임
	@RequestMapping(value="/calcu_proc", method=RequestMethod.GET)
	String calcu_proc(int x, int y, Model model)
	{
		int result = x + y;
		model.addAttribute("result", result);
		return "calc_proc";
	}
}
