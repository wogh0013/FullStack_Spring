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
	String board_list(Model model, BoardDto dto)
	{
		
		System.out.println("선택 : " + dto.getKey());
		System.out.println("검색어 : " + dto.getKeyword());
		
		dto.setStart( dto.getPg()*10); 
		
		List<BoardDto> list = service.getList(dto);
		
		
		for(BoardDto tempDto : list)
		{
			System.out.println(tempDto.getTitle());
		}
		
		model.addAttribute("boardList", list);
		model.addAttribute("totalCnt", service.getTotal(dto));
		
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
	String board_write(Model model)
	{
		model.addAttribute("boardDto", new BoardDto()); 
		return "board/board_write";
	}
	
	@RequestMapping(value="/board/save")
	String board_save(BoardDto dto)
	{
		
		if( dto.getId().equals(""))
			service.insert(dto);
		else 
			service.update(dto);
		
		return "redirect:/board/list";  //글쓰고나면
	}

	@RequestMapping(value="/board/delete")
	String board_delete(BoardDto dto)
	{
		service.delete(dto.getId());
		
		return "redirect:/board/list";  //글쓰고나면
	}
	
	@RequestMapping(value="/board/modify")
	String board_modify(BoardDto dto, Model model)
	{
		model.addAttribute("boardDto", service.getView(dto.getId()) );
		
		return "board/board_write"; //write.jsp 로 이동한다 
	}
	
	
}



















