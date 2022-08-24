package edu.kh.poly.ex2.model.service;

import java.util.Scanner;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Calculator;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.KYSCalculator;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractionService {
	public void ex1() {
		// 추상클래스는 정말로 객체 생성이 안될까?
		
		//Animal a=new Animal(); //Cannot instantiate the type Animal
		
		// Animal을 상속받은 자식클래스를 이용해 객체 생성
		
		Fish f1=new Fish();
		f1.setType("어류");// 자식 객체 내부에 부모 부분이 있음을 확인
		
		Person p1=new Person();
		p1.setType("포유류");// 자식 객체 내부에 부모 부분이 있음을 확인
		
		// 추상 클래스는 부모 타입의 참조 변수로 사용할 수 있다
		// -> 다형성의 업캐스팅
		
		Animal a1=new Fish();
		Animal a2=new Person(); // 업캐스팅 확인
		
		// 추상 메서드였던 breath() 호출 가능 여부 확인
		
		a1.breath();
		a2.breath();
		// 실행 전에는 Animal의 breath()와 연결 된 것으로 보임(정적 바인딩)
		// 실행 중 오버라이딩한 자식의 breath()로 연결됨(동적 바인딩)
		// -> 동적 바인딩에 의해 정상 수행 될 것을 알기 때문에 에러 X
		
		
		
		// 객체배열 + 추상클래스
		Animal[] arr=new Animal[3];// animal 참조 변수 3개 묶음
		
		arr[0]=new Person();
		arr[1]=new Person();
		arr[2]=new Fish();
		// arr[i] 인덱스에 어떤 Animal 자식 객체가 있는지 모르지만
		// 다들 강제 오버라이딩한 breath()라는 공통적인 메서드를
		// 가지고 있으므로 arr[i].breath(); 작성 가능
		for(int i=0;i<arr.length;i++) {
			arr[i].breath();
		}
		
	}
	
	public void ex2() {
		// 인터페이스를 상속한 자식 객체는
		// 부모 객체를 포함하지 않는다.
		
//		KH arr[]=new KH[2];
//		
//		arr[0]=new HSH();// 업캐스팅
//		arr[1]=new HGD();// 업캐스팅
//		// 부모 타입 참조=자식객체
//		// 부모 : KH인터페이스 == 인터페이스도 부모 참조 변수로 사용 가능
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i].lesson(); 
//			// 정적 바인딩 : KH.lesson() (추상 메서드)
//			// 동적 바인딩 : 
//			// arr[0] -> HSH.lesson()
//			// arr[1] -> HGD.lesson()
//		}
	}
	
	public void ex3() {
		Calculator cal=new KYSCalculator();
				
		 Scanner sc = new Scanner(System.in); 
	      
	      System.out.println("[사칙연산]");
	      System.out.print("정수 1 : ");
	      int num1 = sc.nextInt();
	      
	      System.out.print("정수 2 : ");
	      int num2 = sc.nextInt();
	      
	      System.out.println( cal.plus(num1, num2) );
	      System.out.println( cal.minus(num1, num2) );
	      System.out.println( cal.multiple(num1, num2) );
	      
	      if(num2 == 0) {
	         System.out.println("0으로 나눌 수 없습니다.");
	      }else {
	         System.out.println( cal.divide(num1, num2) );
	      }
	      
	      System.out.println("---------------------------------");
	      
	      System.out.print("반지름 입력 : ");
	      double r = sc.nextDouble();
	      
	      System.out.println("원의 넓이 : " + cal.areaOfCircle(r));
	      
	      System.out.println("---------------------------------");
	      
	      System.out.println("a의 b제곱");
	      
	      System.out.print("a 입력 : ");
	      double a = sc.nextDouble();
	      
	      System.out.print("b 입력(정수) : ");
	      int b = sc.nextInt();
	      
	      System.out.println("결과 : " + cal.pow(a, b));
	
	}
}

