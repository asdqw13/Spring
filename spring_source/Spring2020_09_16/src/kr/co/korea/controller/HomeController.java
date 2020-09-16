package kr.co.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
//	@GetMapping("/")
//	public String home() {
//		return "/index";
//	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "/index";
	}
	
//	@GetMapping("/board/write")
//	public String home() {
//		return "/board/write";
//	}
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write() {
		return "/board/write";
	}
	
//	@GetMapping("/board/list")
//	public String home() {
//		return "/board/list";
//	}
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list() {
		return "/board/list";
	}
}