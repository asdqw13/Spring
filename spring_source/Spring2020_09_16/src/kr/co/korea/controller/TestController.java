package kr.co.korea.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

//@Controller
public class TestController {
	@PostMapping("/test1")
	public String test1(HttpServletRequest request) { // HttpServletRequest 클래스 통하여 주입
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		for (String str : hobby) {
			System.out.println("hobby:" + str);
		}
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		if (hobby != null) {
			for (String str : hobby) {
				System.out.println("hobby:" + str);
			}
		}
		return "test2";
	}

	@GetMapping("/test3")
	public String test3(WebRequest request) { // WebRequest 클래스 통하여 주입

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		for (String str : hobby) {
			System.out.println("hobby:" + str);
		}
		return "test3";
	}

	@GetMapping("/test4/{id}/{name}/{hobby}")

	public String test4(@PathVariable int id, @PathVariable int name, @PathVariable int hobby) {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("hobby:" + hobby);
		int add = id + name + hobby;
		System.out.println("add:" + add);
		return "test4";
	}

	@GetMapping("/test5")

	public String test5(@RequestParam int id, @RequestParam int name, @RequestParam int[] hobby) {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		for (int str : hobby) {
			System.out.println("hobby:" + str);
		}
		return "test5";
	}

	@GetMapping("/test6")

	public String test6(@RequestParam(value = "id") int value1, @RequestParam(value = "name") int value2,
			@RequestParam(value = "hobby") int[] value3) {
		System.out.println("id:" + value1);
		System.out.println("name:" + value2);
		for (int str : value3) {
			System.out.println("hobby:" + str);
		}
		return "test6";
	}

	@GetMapping("/test7")

	public String test7(@RequestParam int id, @RequestParam(required = true) String name,
			@RequestParam(defaultValue = "0") int hobby) {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("hobby:" + hobby);
		return "test7";
	}

	@GetMapping("/test8")

	public String test8(@RequestParam Map<String, String> map) {
		String id = map.get("id");
		String name = map.get("name");
		System.out.printf("id :%s\n", id);
		System.out.printf("name :%s\n", name);
		return "test8";
	}
}