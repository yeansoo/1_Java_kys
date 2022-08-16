package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[] args) {
		
		KYS 김연수=new KYS();
		// heap 영역에 KYS 클래스에 정의된 내용을 이용하여 
		// KYS 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : "+김연수.name);
		System.out.println("나이 : "+김연수.age);
		System.out.println("생년월일 : "+김연수.birthday);
		
		//System.out.println("비밀번호 : "+ 김연수.password);
		//The field KYS.password is not visible
		
		김연수.showPassword();
		// 기능 수행
		김연수.eat();
		김연수.study();
		김연수.plus(3,4);
		
	}
}
