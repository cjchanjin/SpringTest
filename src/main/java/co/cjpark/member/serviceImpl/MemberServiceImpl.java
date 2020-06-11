package co.cjpark.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.cjpark.member.mapper.MemberMapper;
import co.cjpark.member.service.MemberService;
import co.cjpark.member.service.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	public MemberMapper map;
	
	@Override
	public List<MemberVo> getSelectList() throws Exception {
		// TODO Auto-generated method stub
		return map.getSelectList();
	}

	@Override
	public MemberVo getSelect(String mId) throws Exception {
		// TODO Auto-generated method stub
		return map.getSelect(mId);
	}

	@Override
	public void memberInsert(MemberVo vo) throws Exception {
		// TODO Auto-generated method stub
		map.memberInsert(vo);
	}

	@Override
	public void memberUpdate(MemberVo vo) throws Exception {
		// TODO Auto-generated method stub
		map.memberUpdate(vo);
	}

	@Override
	public void memberDelete(MemberVo vo) throws Exception {
		// TODO Auto-generated method stub
		map.memberDelete(vo);
	}

}
