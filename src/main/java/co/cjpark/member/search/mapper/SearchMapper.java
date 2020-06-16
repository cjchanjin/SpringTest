package co.cjpark.member.search.mapper;

import org.mybatis.spring.annotation.MapperScan;

import co.cjpark.member.search.service.SearchService;

@MapperScan
public interface SearchMapper extends SearchService{

}
