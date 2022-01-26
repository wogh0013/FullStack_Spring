package com.woori.myhome.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardDao")  //없으면 안된다. 스프링이 이거 보고 객체를 만들어서 관리한다 
public class BoardDaoImpl implements BoardDao{
	
	List<BoardDto> list = new ArrayList<BoardDto>();
	
	public BoardDaoImpl()
	{
		for(int i=1; i<=10; i++)
			list.add(new BoardDto(i+"", "제목"+i, "작성자"+i,"내용"+i, "2022-11-23"));
	}
	@Override
	public List<BoardDto> getList() {
		
		return list;
	}

	@Override
	public void insert(BoardDto dto) {
		
		dto.setId( String.valueOf(list.size()+1));
		list.add(dto);
	}
	
	@Override
	public BoardDto getView(String id) {
		
		int nid = Integer.parseInt(id)-1;
		
		return list.get(nid);
	}

}




