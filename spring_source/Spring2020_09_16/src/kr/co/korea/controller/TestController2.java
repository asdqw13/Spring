package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class TestController2 {

	@PostMapping("board/write")
	
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
