package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;
import edu.kh.oop.field.model.vo.Temp;

public class ConstructorRun {
	public static void main(String[] args) {
		Member member1=new Member();// 기본 생성자
		
		Member member2=new Member();
		Member member3=new Member("member22","pass","010292929292",25);
		//							->
		// 기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다
		// -> 클래스에 생성자가 하나도 작성되지 않으면
		// 컴파일러가 자동으로 기본 생성자를 추가해준다.
		// public Member( ){ } // Member클래스에 자동 추가
		System.out.println("프로그램 종료");
		
		Temp t1=new Temp();
	}
}
