package ksmart.springboot.exam.dto;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel;
	private String memberMoblie;
	
	public Member() {}
	
	
	public Member(String memberId, String memberPw, String memberName, String memberLevel, String memberMoblie) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberLevel = memberLevel;
		this.memberMoblie = memberMoblie;
	}


	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getMemberMoblie() {
		return memberMoblie;
	}
	public void setMemberMoblie(String memberMoblie) {
		this.memberMoblie = memberMoblie;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [memberId=");
		builder.append(memberId);
		builder.append(", memberPw=");
		builder.append(memberPw);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", memberLevel=");
		builder.append(memberLevel);
		builder.append(", memberMoblie=");
		builder.append(memberMoblie);
		builder.append("]");
		return builder.toString();
	}
}
