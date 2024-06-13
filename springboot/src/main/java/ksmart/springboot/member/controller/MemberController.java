package ksmart.springboot.member.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ksmart.springboot.exam.dto.Member;
import ksmart.springboot.exam.service.ExamService;


/**
 @RestController : @Controller + @ResponseBody
 */
@RestController
public class MemberController {
	private final ExamService examService;
	public MemberController(ExamService examService) {
		this.examService = examService;
	}
	
	/**
	 * @RequestBody : 요청한 json 객체를 서버에서 바인딩 받을 때 사용하는 어노테이션
	 * */
	
	@PostMapping("/member/searchId")
	public Member getMemberInfo(@RequestBody Map<String, String> paramMap) {
	
		String memberId = paramMap.get("memberId");
		return examService.getMemberInfoById(memberId);
	}
	
	
	@GetMapping("/member/list")
	public List<Member> getMemberList(){
		return examService.getMemberList();
	}
	
	
	
	/**
	@PathVariable : 주소 매핑 시 {바인딩 받을 키}
	핸들러 메서드 매개변수의 @PathVariable(name="바인딩 받을 키") 데이터타입 변수명
	*/
	
	@GetMapping("/member/{memberId}")
	public Member getMemberInfoId(@PathVariable(name = "memberId")String memberId) {
		
		return examService.getMemberInfoById(memberId);
	}

}
