package co.cjpark.member.search.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.cjpark.member.search.mapper.SearchMapper;
import co.cjpark.member.search.service.SearchFilterVo;
import co.cjpark.member.search.service.SearchService;

@Service
@Primary
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	public SearchMapper map;
	
	@Override
	public List<Map> getSelectList(SearchFilterVo searchFilterVo) throws Exception {
		// TODO Auto-generated method stub
		return map.getSelectList(searchFilterVo);
	}

	@Override
	public Map getSelect(String helperNo) throws Exception {
		// TODO Auto-generated method stub
		return map.getSelect(helperNo);
	}

}
