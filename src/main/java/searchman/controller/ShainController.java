package searchman.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import searchman.entity.Shain;
import searchman.service.ShainService;

@Controller
public class ShainController {

	@Autowired
	private ShainService shainService;

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute Shain request) {
		//パラメータ値を表示
		System.out.println("id:" + request.getId());
		System.out.println("name:" + request.getName());
		System.out.println("sei:" + request.getSei());
		System.out.println("nen:" + request.getNen());
		System.out.println("address:" + request.getAddress());

		return "redirect:index";
	}

	@GetMapping("/index")
	public String index(Model model) {

		//社員リストを取得
		ArrayList<Shain> shainList = shainService.findAll();

		// JSPに渡す
		model.addAttribute("shainList", shainList);

		return "index";
	}

	@GetMapping("/update")
	public String update(
			@RequestParam("id") int id,
			Model model) {
		//パラメータ値を表示
		System.out.println("id:" + id);

		//社員を作成
		Shain shain = new Shain();
		shain.setId(101);
		shain.setName("鈴木義信");
		shain.setSei("男");
		shain.setNen(2003);
		shain.setAddress("宮城県仙台市");

		// JSPに渡す
		model.addAttribute("shain", shain);

		return "update";
	}

}
