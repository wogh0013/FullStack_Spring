package com.woori.myhome.member;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Resource(name="memberService")
	MemberService memberService;
	
	@RequestMapping("/member/join")
	String member_register()
	{
		return "member/member_register";
	}
	
	@RequestMapping("/member/isDuplicate")
	@ResponseBody //Ajax 요청시 데이터가 출력돼야 한다. jsp 이동을 막는다.
				  //자바 객체를 json 형태로 전환시켜 반환한다.
	public HashMap<String, String> member_isDuplicate(String userid, String password)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
			map.put("result", memberService.isDuplicate(dto)+"");
		
		return map;
	}
}
