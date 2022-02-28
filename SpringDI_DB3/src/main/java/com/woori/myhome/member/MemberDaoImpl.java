package com.woori.myhome.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public boolean isDuplicate(MemberDto dto) {
		
		int cnt = sm.selectOne("Member_isduplicate", dto);
		if(cnt==0)
			return false;
		else
			return true;
	}

}
