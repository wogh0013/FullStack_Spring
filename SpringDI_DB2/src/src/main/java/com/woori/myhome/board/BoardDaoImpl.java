package com.woori.myhome.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDao")  //없으면 안된다. 스프링이 이거 보고 객체를 만들어서 관리한다 
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	SqlSessionTemplate sm; //sm객체를 통해서 DB 데이터 읽고 쓰기

	@Override
	public List<BoardDto> getList(){
		return sm.selectList("Board_getList", null);
	}
	
	@Override
	public void insert(BoardDto dto) {
		sm.insert("Board_insert", dto);
	}
	
	@Override
	public BoardDto getView(String id) {
		return sm.selectOne("Board_getView", id);
	}
	
	

}




