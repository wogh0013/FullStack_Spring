package com.woori.myhome.score;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("scoreDao")
public class ScoreDaoImpl implements ScoreDao {

	List<ScoreDto> list = new ArrayList<ScoreDto>();
	
	public ScoreDaoImpl()
	{
		list.add(new ScoreDto(1, "A", 90, 90, 90));
		list.add(new ScoreDto(2, "B", 90, 90, 90));
		list.add(new ScoreDto(3, "C", 90, 90, 90));
		list.add(new ScoreDto(4, "D", 60, 60, 60));
		list.add(new ScoreDto(5, "E", 80, 70, 60));
	}
	
	@Override
	public List<ScoreDto> getList() {
		
		return list;
	}

	@Override
	public void insert(ScoreDto dto) {
		dto.setId(list.size()+1);
		
		dto.calc();
		list.add(dto);
		
	}

	@Override
	public ScoreDto getView(int id) {
		
		return list.get(id-1);
	}

}



