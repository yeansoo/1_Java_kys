package edu.kh.poly.ex1.mode1.service;

import edu.kh.poly.ex1.mode1.vo.Car;
import edu.kh.poly.ex1.mode1.vo.Truck;

public class Example1 {
	
	// 다형성 : 상속을 이용한 기술로
	// 			부모 타입의 참조 변수 하나가 
	//			여러 타입이 자식 객체를 참조할 수 있음.
	
	public void ex1() {
		// 업캐스팅 : 부모 참조변수 = 자식 객체 
		
		Car c1=new Car();
		//부모 참조 변수 = 부모 객체
		
		// **업캐스팅 확인
		Car c2=new Truck();
		//부모 참조변수 = 자식 객체 
	}
}
