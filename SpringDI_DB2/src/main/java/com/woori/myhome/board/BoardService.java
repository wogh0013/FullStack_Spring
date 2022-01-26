package com.woori.myhome.board;

import java.util.List;

public interface BoardService {
	List<BoardDto> getList();
	void insert(BoardDto dto);
	BoardDto getView(String id);
}
