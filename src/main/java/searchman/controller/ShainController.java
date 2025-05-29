package searchman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShainController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}
	
//	@GetMapping("/test")
//	public String test() {
//		return "/WEB-INF/test.jsp";
//	}
//
//	@GetMapping("/insert")
//	public String insert() {
//		return "/WEB-INF/insert.jsp";
//	}
//
//	@GetMapping("/index")
//	public String index() {
//		return "/WEB-INF/index.jsp";
//	}
//
//	@GetMapping("/update")
//	public String update() {
//		return "/WEB-INF/update.jsp";
//	}
}
