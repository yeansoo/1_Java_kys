package edu.kh.control.loop;

import java.util.Scanner;
import java.lang.String;

public class WhileExample {
	/* while문
	 * 
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 *  반복 조건만을 설정하는 반복문
	 *  
	 *  - 반복 횟수가 정해져 있진 않지만
	 *  언젠간 반복이 종료되는 경우에 사용
	 *  
	 *  [ 작성법]
	 *  
	 *  while(조건식){
	 *  	조건식이 true인 겨우 반복 수행할 구문
	 *  }
	 * 
	 */
	
	public void ex1() {
		// while 기초 사용법 1
		
		// 1부터 10까지 출력 ( while / for )
		
		for(int i=1;i<=10;i++)
			System.out.println(i);
		
		System.out.println("================");
		int i=1;
		while(i<=10) {
			System.out.println(i++);
		}
	}
	
	public void ex2() {
		// while 기초 사용법 2
		
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int input=-1;
		// while문 내에서 입력 받은 값을 저장할 변수
		// 입력 받은 값이 0인 경우 라는 조건을 판별하기 위해 
		// while문 보다 앞에 선언
		
		// 하지안 input변수 선언시 초기화 되어있지 않으면
		// 조건식 수행을 못하기 때문에
		// 0이 아닌 임의의 값을 이용해서 초기화 함.
		
		// -> 왜 0은 안되는가?
		// 0으로 초기화하는 경우 while문 조건이 바로 false가 되어 
		// 한번도 반복을 못하는 상황이 발생하기 때문에
		
		
		while(input!=0){
			// input cannot be resolved to a variable
			// == input 변수가 해석되지 않는다 == 변수가 존재하지 않는다
			 
			// The local variable input may not have been initialized
			// == input 변수가 초기화 되지 않았다
			System.out.print("정수 입력 : ");
			input=sc.nextInt();
			
			sum+=input;
			System.out.println("현재 누적 값 : "+sum);
		}
	}
	
	public void ex3() {
		// 분식집 주문 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		
		String menu = "";
		// "" == 빈 문자열 (내용은 없지만 문자열)
		
		boolean flag=false;// 신호로 사용하는 변수
		// true : 첫 번째 아닌 주문
		// false : 첫 번째 주문
	
		int sum=0;
		while(input!=9) {
			System.out.println(" --- 메뉴 ---");
			System.out.println("1. 떡볶이 (5000원)");
			System.out.println("2. 김밥 (3000원)");
			System.out.println("3. 라면 (4000원)");
			System.out.println("4. 돈까스 (8000원)");
			System.out.println("9. 주문 완료");
			System.out.print("메뉴 선택 >> ");
			
			input=sc.nextInt();
			
			if(flag&&input>=1&&input<=4) {//true인 경우 실행(첫 주문이 아니면서 + 메뉴를 잘 입력했을 때)
				menu+=", ";
			}else{// false인 경우(첫 주문) 실행
				flag=true;
			}
			
			switch(input) {
			
			case 1:
//				if(flag)
//					menu+=", ";    모든 case에 이거 넣어도 위처럼 조건을 걸지 않고 할수는 있으나 같은 구문 반복해서 별루
				menu+="떡볶이";
				
				sum+=5000;break;
			case 2:
				menu+="김밥";
				sum+=3000;break;
			case 3:
				menu+="라면";
				sum+=4000;break;
			case 4:
				menu+="돈까스";
				sum+=8000;break;
			case 9:
				flag=true;
				break;
				default:
					
			}
		
			System.out.println();
		}
		
	
		System.out.println(menu+"를 주문하셨습니다");
		System.out.println(sum+"원 입니다.");
		
	}
	
	public void ex4() {
		
		/*
		 
		 [ 작성법 ]
		 
		 - 최소 1회 이상 반복하는 while문
		 
		 do{
		 
		 }while(조건식);
		 
		 do				: { } 내부 코드를 일단 수행해라
		 while(조건식)	: 조건식이 true이면 { } 내부 코드를 반복수행
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int input;
		do{
			System.out.print("정수 입력 : ");
			input=sc.nextInt();
			
			sum+=input;
			System.out.println("현재 누적 값 : "+sum);
		}while(input!=0);
	}

}
