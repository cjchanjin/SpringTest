package co.cjpark.member.pay.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.cjpark.member.pay.mapper.PayMapper;
import co.cjpark.member.pay.service.PayService;
import co.cjpark.member.pay.service.PayVo;

@Service("payService")
public class PayServiceImpl implements PayService{

	@Autowired
	public PayMapper payMap;
	
	@Override
	public void payResultInsert(PayVo payVo) throws Exception {
		// TODO Auto-generated method stub
		payMap.payResultInsert(payVo);
	}

}
