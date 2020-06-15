package co.cjpark.member.pay.mapper;

import org.mybatis.spring.annotation.MapperScan;

import co.cjpark.member.pay.service.PayService;

@MapperScan
public interface PayMapper extends PayService{

}
