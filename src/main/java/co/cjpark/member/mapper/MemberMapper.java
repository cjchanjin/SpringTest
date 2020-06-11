package co.cjpark.member.mapper;

import org.mybatis.spring.annotation.MapperScan;

import co.cjpark.member.service.MemberService;

@MapperScan
public interface MemberMapper extends MemberService {

}
