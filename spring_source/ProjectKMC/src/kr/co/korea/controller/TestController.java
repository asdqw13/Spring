package kr.co.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.korea.beans.TestBean;
import kr.co.korea.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/insert")
	public String insert(TestBean testBean) {
		System.out.println("삽입확인");
		return "member/insert";
	}
	
	@PostMapping("/insert_pro")
	public String insert_pro(TestBean testBean) {
		testService.insertMemberInfo(testBean);
		System.out.println("삽입완료");
		return "member/insert_pro";
	}
	
	@GetMapping("/delete")
	public String delete(TestBean testBean) {
		System.out.println("삭제확인");
		return "member/delete";
	}
	
	@PostMapping("/delete_pro")
	public String delete_pro(TestBean testBean) {
		testService.deleteMemberInfo(testBean);
		System.out.println("삭제완료");
		return "member/delete_pro";
	}
}