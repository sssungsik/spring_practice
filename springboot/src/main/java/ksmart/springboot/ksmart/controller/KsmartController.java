package ksmart.springboot.ksmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KsmartController {
	@GetMapping("/ksmart/view")
	public String ksmartView(Model model) {
		model.addAttribute("title", "최성식");
		
		return "ksmart/ksmartView";
		
		
	}

}
