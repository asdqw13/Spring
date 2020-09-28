package kr.co.korea.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.korea.beans.DataBean;

@Controller
public class TestController {
	
	@Autowired
	SqlSessionTemplate sqltemp;
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@GetMapping("/result")
	public String result(DataBean dataBean) {
		sqltemp.insert("test_db.insert_data", dataBean);
		return "result";
	}
	
//	@GetMapping("/show")
//	public ModelAndView show(ModelAndView mv) {
//		List<DataBean> list = sqltemp.selectList("test_db.select_data");
//		mv.addObject("list", list);
//		mv.setViewName("show");
	
//		int cnt = sqltemp.selectOne("test_db.select_one");
//		mv.addObject("cnt", cnt);
//		mv.setViewName("show");
//	
//		return mv;
//	}
	
	@GetMapping("/show")
	public String show(Model model) {
		List<DataBean> list = sqltemp.selectList("test_db.select_data");
		model.addAttribute("list", list);
		
		int cnt = sqltemp.selectOne("test_db.select_one");
		model.addAttribute("cnt", cnt);
		
		return "show";
	}
}