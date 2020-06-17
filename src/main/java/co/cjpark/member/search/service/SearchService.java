package co.cjpark.member.search.service;

import java.util.List;
import java.util.Map;

public interface SearchService {

	List <Map> getSelectList(SearchFilterVo searchFilterVo) throws Exception;
	Map getSelect (String helperNo) throws Exception;
}
