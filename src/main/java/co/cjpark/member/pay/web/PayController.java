package co.cjpark.member.pay.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.cjpark.member.pay.service.PayService;
import co.cjpark.member.pay.service.PayVo;
import co.cjpark.member.service.MemberService;
import co.cjpark.member.service.MemberVo;

@Controller
public class PayController {

	@Autowired
	public PayService payService;
	public PayVo payVo;
	
	
	@RequestMapping("pay.do")
	public String pay(HttpSession session, HttpServletRequest request) {
		
		
		return "pay/pay";
	}
	
	@RequestMapping(value="savePayResult.do" , method=RequestMethod.POST)
	@ResponseBody
	public PayVo savePayResult (PayVo payVo) throws Exception {
		System.out.println(payVo);
		payService.payResultInsert(payVo);
		
		return payVo;
	}
	
	@RequestMapping("paySuccess.do")
	public String paySuccess () {
		
		
		return "pay/paySuccess";
	}
}
