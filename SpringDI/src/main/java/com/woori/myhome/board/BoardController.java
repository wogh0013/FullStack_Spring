package com.woori.myhome.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class BoardController {

	//@Autowired
	@Resource(name="boardService")
	BoardService service;
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	String board_list(Model model)
	{
		List<BoardDto> list = service.getList();
		for(BoardDto tempDto : list)
		{
			System.out.println(tempDto.getTitle());
		}
		
		model.addAttribute("boardList", list);
		return "board/board_list"; //jsp파일명
	}
	
	//  /board/view?id=1
	@RequestMapping(value="/board/view", method=RequestMethod.GET)
	String board_view(String id, Model model)
	{
		BoardDto dto = service.getView(id);
		model.addAttribute("boardDto", dto);
		return "board/board_view";
	}
	
	
	@RequestMapping(value="/board/write")
	String board_write()
	{
		return "board/board_write";
	}
	
	@RequestMapping(value="/board/save")
	String board_save(BoardDto dto)
	{
		service.insert(dto);
		
		return "redirect:/board/list";  //글쓰고나면
	}
	
}



















