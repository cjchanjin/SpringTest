package co.cjpark.member.search.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import co.cjpark.member.search.service.SearchFilterVo;

@Controller
public class CheckSearchController {

	@RequestMapping("check.do")
	public String check() {
		return "checkSearch/check";
	}
	
	@RequestMapping("checkList.do")
	public String checkList (SearchFilterVo filterVo) { 
		System.out.println(filterVo);
		
		return "#";
	}
}
