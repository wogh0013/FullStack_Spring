package com.woori.myhome.board;

import java.util.List;
//클래스와의 결합력을 약화시키기 위해서 
public interface BoardDao {
	List<BoardDto> getList();
	void insert(BoardDto dto);
	BoardDto getView(String id);
}
