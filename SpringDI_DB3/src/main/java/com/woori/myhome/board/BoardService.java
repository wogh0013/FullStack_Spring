package com.woori.myhome.board;

import java.util.List;

public interface BoardService {
	List<BoardDto> getList(BoardDto dto);
	void insert(BoardDto dto);
	BoardDto getView(String id);
	int getTotal(BoardDto dto);
	void delete(String id);
	void update(BoardDto dto);
}
