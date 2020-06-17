package co.cjpark.member.search.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.cjpark.member.search.service.SearchFilterVo;
import co.cjpark.member.search.service.SearchService;

@Controller
public class CheckSearchController {

	@Autowired
	public SearchService searchService;
	
	@RequestMapping("helperList.do")
	public String helperList(SearchFilterVo searchFilterVo, Model model) throws Exception {
		List <Map> list = searchService.getSelectList(searchFilterVo);
		System.out.println(searchFilterVo);
		
		model.addAttribute("searchList", list);
		
		return "helperSearch/helperList";
	}
	
	@RequestMapping("helperInfo.do")
	public String memberInfo(@RequestParam("helperNo") String hNo, Model model) throws Exception {
		String helperNo = hNo;
		System.out.println(helperNo);
		
		Map map = searchService.getSelect(helperNo);
		model.addAttribute("helperInfo", map);
		
		return "helperSearch/helperInfo";
	}
}
