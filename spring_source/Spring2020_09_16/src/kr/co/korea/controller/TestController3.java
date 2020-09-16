package kr.co.korea.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController3 {
	
	@GetMapping("/test1")
	public String test1() { // test1.jsp로 이동
		return "test1";
	}

	@GetMapping("/test2")
	public String test2() { // test2.jsp로 이동
		return "test2";
	}

	@GetMapping("/test3")
	public String test3(HttpServletRequest request) { // (1) request객체 주입받아서 데이터 담기
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		return "test3";
	}

	@GetMapping("/test4")
	public String test4(Model model) { // (2) model객체에 주입받아서 데이터 담기
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400);
		return "test4";
	}

	@GetMapping("/test5")
	public ModelAndView test5(ModelAndView mv) { // (3) ModelAndView객체에 데이터 담기
		mv.addObject("data1", 500);
		mv.addObject("data2", 600);
		mv.setViewName("test5");
		return mv;
	}
	
	@GetMapping("/result")
	public String write
		(@RequestParam String name,
		@RequestParam String kor,
		@RequestParam String eng,
		@RequestParam String mat)
	{
		// 과제
		Integer tot =
				Integer.valueOf(kor) +
				Integer.valueOf(eng) +
				Integer.valueOf(mat);
		// 이름, 총점
		System.out.println("name : " + name);
		System.out.println("tot : " + tot);
		return "result";
	}
}