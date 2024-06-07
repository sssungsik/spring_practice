package ksmart.springboot.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ksmart.springboot.exam.dto.Member;

/*
 * @Service : 비지니스 로직 수행, 기능구현, data 가공
 * 			 (트렌젝션 : 논리적 작업을 수행하는 한 단위)
 * 			  Bean 이름 : ExamService => examService
 * 
 * */

@Service
public class ExamService {
	
	public ExamService() {
		System.out.println("객체생성 ");
	}
	
	public List<Member> getMemberList(){
		
		// Member id 001 ~ 009 arrayList 만들어보세요.
		// id001:관리자 id002:판매자 id003:구매자
		List<Member> list = new ArrayList<Member>();
		String[] levelList = new String[] {"관리자","판매자","구매자"};
		Member member = null;
		
		for(int i = 0; i < 10; i++) {
			String memberId = "id00" + i;
			String memberPw = "pw00" + i;
			String memberLevel = levelList[(i-1)% levelList.length];
			String memberName = "홍0" + i;
			String memberMobile = "010-" +i+i+i+i+"-"+i+i+i+i;
			member = new Member(memberId, memberPw, memberLevel, memberName, memberMobile);
			list.add(member);			
		}	
		return list;
	}
	
	/*
	public void payOrder(String memberId, Goods goods, Order order, Payment pay) {
		// 1. 주문 내역 확인 및 상품 재고 확인
		
		// 2. 주문 내역 결제 금액 충분
		
		// 3. 상품 재고 업데이트
		
		// 4. 주문 주문이력 추가
		
		// 5. 
	}
	*/
}
