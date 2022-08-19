package edu.kh.oop.field.model.vo;

public class Trainee {// 훈련생
	public String name;// 이름
	public String phone;// 휴대폰번호
	public String email;// 이메일
	public int salary;// 훈련수당
	public static char classRoom;// 강의장
	
	// 명시적 초기화 : 필드 선언 시 바로 값 초기화
	// ex) public String email="없음";

	// 초기화 블록 : 객체(instance) 생성 시 마다 해당 객체의 필드를 초기화하는 블록
	// - instance block : static이 없는 필드 값 초기화
	// - static block : static이 있는 필드 값 초기화
	
	{// instance block
		email="없음";
		salary=116000;
	}
	
	static {// static block
		classRoom='A';
	}
}
