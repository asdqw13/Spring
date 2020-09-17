package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.korea.beans.DataBean;
import kr.co.korea.beans.dataBean1;

//@Controller
public class TestController {
	
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean1)
	{
		System.out.println("==== test1 ====");
		return "test1";
	}
	
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean1)
	{
		System.out.println("==== test2 ====");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(dataBean1 bean2)
	{
		System.out.println("==== test3 ====");
		return "test3";
	}
}