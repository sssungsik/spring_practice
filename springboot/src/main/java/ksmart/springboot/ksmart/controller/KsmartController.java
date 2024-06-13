package ksmart.springboot.ksmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KsmartController {

	@PostMapping("/ksmart/view")
	public String ksmartView(Model model) {
		
		model.addAttribute("title", "한국스마트정보교육원 개발자 51기");
		
		return "ksmart/ksmartView";
	}
}
