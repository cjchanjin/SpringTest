package co.cjpark.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.member.service.MemberService;
import co.cjpark.member.service.MemberVo;

@Controller
public class MemberController {

	@Autowired
	public MemberService memberService;
	public MemberVo memberVo;
	
	@RequestMapping("memberList.do")
	public ModelAndView memberList(ModelAndView mav) throws Exception {
		List <MemberVo> list = memberService.getSelectList(); 
		mav.addObject("list", list);
		mav.setViewName("member/memberList");
		
		return mav;
	}
	
	@RequestMapping("memberInfo.do")
	public String memberInfo(@RequestParam("mId") String id, Model model) throws Exception {
		String mId = id;
		System.out.println(mId);
		
		memberVo = memberService.getSelect(mId);
		model.addAttribute("view", memberVo);
		
		return "member/memberInfo";
	}
	
	@RequestMapping("memberDelete.do")
	public String memberDelete(@RequestParam("mId") String id, Model model) throws Exception {
		String mId = id;
		System.out.println(mId);
		
		
		return null;
	}
	
	@RequestMapping("chat.do")
	public String chat() {
		return "chat/chat";
	}
	
}
