package co.cjpark.member.service;

import java.util.List;

public interface MemberService {
	List <MemberVo> getSelectList() throws Exception;
	MemberVo getSelect (String mId) throws Exception;
	void memberInsert (MemberVo vo) throws Exception;
	void memberUpdate (MemberVo vo) throws Exception;
	void memberDelete (MemberVo vo) throws Exception;
	
}
