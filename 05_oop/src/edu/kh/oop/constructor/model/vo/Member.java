package edu.kh.oop.constructor.model.vo;

public class Member {
	
	// 추상화 -> 아이디, 비밀번호, 전화번호, 나이
	
	// 캡슐화 -> 추상화 결과를 묶고, 데이터 직접 접근 제한
	
	// 필드(==멤버변수)
	private String memberID;
	private String memberPW;
	private String memberPhone;
	private int memberAge;
	
	// 생성자(객체를 생성할 때 사용하는 기능)
	
	// 생성자 작성 규칙 1. 클래스명 == 생성자명
	// 생성자 작성 규칙 2. 반환형X
	
	// 기본 생성자 : () 내에 아무것도 없는 생성자
	//				--> 매개변수가 없는 생성자
	
	public Member() {
		// 생성자 사용 목적 1. 필드 초기화
		
		memberID="member01";
		memberPW="pass01!";
		memberPhone="01023232323";
		memberAge=25;
		
		// 생성자 사용 목적 2. 객체 생성 시 특정 기능 수행
		System.out.println("Member객체가 생성되었습니다.");
		
		// 한번 만들어둔 생성자를 계속 재사용
		// -> 코드길이 감소, 재사용성 증가
	}
	
	public Member(String memberId, String memberPw,String memberPhone,int memberAge) {
		// -> 매개변수(Parameter)
		// * 매개 : 둘 사이에 관계 형성
		
		//필드와 매개변수의 이름이 같을 경우
		//변수명 호출 시 가까운 필드 또는 매개변수가 호출된다. 
		
		
		// this 참조변수
		// - 생성된 객체(인스턴스)에 숨겨진 참조변수로 현재 객체의 시작 주소를 참조함
		// ==현재 객체를 참조함
		
		// 생성된 객체의 필드를 매개변수 초기화
		memberID=memberId;
		memberPW=memberPw;
		this.memberPhone=memberPhone;
		this.memberAge=memberAge;
	}
	
	
	// 오버로딩(OverLoading, 과적)
	// -> 이름 하나로 여러 기능을 수행할 수 있게 하는 것
	// == 동일한 메서드(또는 생성자)명으로 여러 메서드를 작성하는 것
	
	// 오버로딩의 조건
	// 1. 메서드(생성자)이름이 같아야 한다. 
	// 2. 매개변수가 타입, 개수, 순서 중 하나라도 달라야 한다. 
	
	public Member(String memberId,String memberPw) {
		// 매개 변수 개수가 달라서 오버로딩 성립
	}
	
	
	// ** 오버로딩 주의사항 **
	// -> 매개변수의 자료형의 타입, 개수, 순서 중 하나라도 달라야 한다. 
	// --> 매개변수명은 사용자가 보기 편하게 하기 위해 의미를 부여하는 것 뿐
	// 컴퓨터한테는 불필요한 요소라서 오버로딩 검사 시  인식하지 않음
	
//	public Member(String memberPw,String memberId) {
//		//Duplicate method Member(String, String) in type Member
//	}

	
	// this() 생성자
	// - 생성자를 이용한 필드 초기화 구문의 중복을 없애고 재사용성을 늘리기 위한 기능
	// - 주의사항 : 반드시 생성자의 첫줄에 작성되어야 한다. 
	
	public Member(int memberAge, String memberPhone) {
		
		// 전달 받은 매개변수로 현재 객체 필드 초기화
		
		this.memberAge=memberAge;
		this.memberPhone=memberPhone;
	}
	
	public Member(String memberID, int memberAge, String memberPhone) {
		
		this(memberAge,memberPhone);
		
		// 전달 받은 매개변수로 현재 객체 필드 초기화
		
		
		this.memberID=memberID;
	}
	
	
	// 메서드(기능)
	
	
}
