package co.cjpark.member.search.service;

import java.util.List;

public interface SearchService {

	List <SearchFilterVo> getSelectList() throws Exception;
}
