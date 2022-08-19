package edu.kh.oop.field.model.vo;


public class FieldRUn {
	public static void main(String[] args) {
		//Student 객체 생성
		
		Student std1=new Student();
		
		std1.name="홍길동";
		
		Student std2=new Student();
		
		std2.name="이순신";
		
		System.out.println("[std1]");
		System.out.println("이름 : "+std1.name);
		System.out.println("학교명 : "+std1.schoolName);
		
		System.out.println("[std2]");
		System.out.println("이름 : "+std2.name);
		System.out.println("학교명 : "+std2.schoolName);
		
		
		// * static 방식으로 접근하기 *
		// -> 클래스명.static 필드명/메서드명
		
		System.out.println("==============");
		System.out.println("초기화 블록 확인하기");
		
		Trainee t1=new Trainee();// 훈련생 객체 생성
		
		System.out.println(t1.name);
		System.out.println(t1.phone);
		System.out.println(t1.email);
		System.out.println(t1.salary);
		System.out.println(t1.classRoom);
		
		Trainee t2=new Trainee();// 훈련생 객체 생성
		
		System.out.println(t2.name);
		System.out.println(t2.phone);
		System.out.println(t2.email);
		System.out.println(t2.salary);
		System.out.println(t2.classRoom);
	}
}
