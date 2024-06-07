package ksmart.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
@Controller : 클라이언트의 요청과 응답을 담당하는 클래스(HTTP통신)
*/
@Controller
public class MainController {
	
	/* 
	 * @GetMapping : HTTP GET방식 주소요청 시 특정 핸들러 메소드와 맵핑시켜주는 이노테이션(@)
	 * @return String : 화면의 논리 경로
	 *  */
	@GetMapping("/")
	public String mainPage() {
		
		return "index";
	}
	
}
