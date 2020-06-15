package co.cjpark.member.pay.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.member.pay.service.PayVo;
import co.cjpark.member.service.MemberService;
import co.cjpark.member.service.MemberVo;

@Controller
public class PayController {

	@Autowired
	public MemberService memberService;
	public MemberVo memberVo;
	
	
	@RequestMapping("pay.do")
	public String pay(HttpSession session, HttpServletRequest request) {
		
		
		return "pay/pay";
	}
	
	@RequestMapping(value="savePayResult.do" , method=RequestMethod.POST)
	@ResponseBody
	public PayVo savePayResult (PayVo payVo) {
		System.out.println(payVo);
		
		return payVo;
	}
	
	@RequestMapping("paySuccess.do")
	public String paySuccess () {
		
		
		return "pay/paySuccess";
	}
}
