package com.woori.myhome.member;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberDao")
	MemberDao memberDao;
	
	@Override
	public boolean isDuplicate(MemberDto dto) {
		return memberDao.isDuplicate(dto);
	}

}
