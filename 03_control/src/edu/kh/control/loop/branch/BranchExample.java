package edu.kh.control.loop.branch;

import java.util.Scanner;

public class BranchExample {
	public void ex1() {
		// break문 : 가장 가까운 반복문을 빠져나가는 구문
		
		for(int i=1;i<=10000;i++) {
			System.out.println(i);
			if(i==10)
				break;
		}
		System.out.println("==============");
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=30;col++) {
				System.out.printf("(%d, %d)  ",row,col);
				if(col==3)
					break;
				
			}
			System.out.println();
			if(row==3)
				break;
		}
		
	}

	
	public void ex2() {
		// 0이 입력될 때 까지의 입력된 정수의 합
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		while(true) { // 조건식에 강제로 true 작성 == 무한반복
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			if(input==0)
				break;
			sum+=input;
		}
		System.out.print("합계 : "+sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다 
		
	}
	
	public void ex3() {
		// "exit@" 문자열이 입력될 때까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str="";
		
		System.out.println("---문자열 입력(종료 시 exit@ 입력)---");
		while(true) { // 조건식에 강제로 true 작성 == 무한반복
			
				String input=sc.nextLine();
				// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다!
				// -> String은 기본 자료형X, 참조형 O
				// -> 참조형은 A.equals(B)로 값을 비교할 수 있다. 
				// A.equals(B) A==B
				if(input.equals("exit@"))
					break;
				str+=input+'\n'; // 누적하면서 줄바꿈
		}
		System.out.print(str);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다 
		
	}
	
	
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue 사용)
		
		for(int i=1;i<=30;i++) {
			if(i%5==0)
				continue;
			System.out.println(i);
		}
		
	}
	
	public void ex5() {
		
		for(int i=1;i<=100;i++) {
			
			if(i==40) {
				System.out.println(i);break;
			}
				
			if(i%5==0)
				continue;
			System.out.println(i);
		
		}
		
	}
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1 ~ 50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇 회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수보다 크면 UP
		// 작으면 DOWN 출력
		
		// 난수 생성 : Math.random() -> Java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0				0.0이상 1.0미만의 난수를 생성 (double형)
		
		Math.random();
		// 0.0 <= x < 1.0
		// 0.0 <= x * 50 < 50.0
		// 0.0 <= x * 50 + 1 < 50.0
		// 0.0 <= (int)(x * 50 + 1) < 50.0 => 1에서 50사이 난수
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int random=(int) (Math.random()*50+1);
		
		System.out.println("난수 생성 완료");
		
		while(true) {
			System.out.print(++count +"번째 입력 > ");
			int input=sc.nextInt();
			if(input==random) {
				break;
			}
			else {
				if(input>random)
					System.out.println("DOWN");
				else
					System.out.println("UP");
			}
		}
		System.out.println("정답입니다! (총 입력 횟수 : "+count+"회");
	}
	
	
	public void rpsGame() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
		int round=sc.nextInt();// 판수 입력
		
		int win=0,lose=0,mid=0;
		
		String[] strrps=new String[3];
		strrps[0]="가위";
		strrps[1]="바위";
		strrps[2]="보";// 0가위 1바위 2보
		int input=-1;
		for(int i=1;i<=round;i++) {
			
			
			System.out.println(i+"번째 게임");
			
			
			int rps=(int)(Math.random()*3);// 랜덤 가위바위보 결정
			
			
			
				System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
				
				
				String inputrps=sc.next();// 사용자 입력 inputrps
//			for(int x=0;x<3;x++)
//			{
//				if(inputrps.equals(strrps[i]))//비교
//					{
//					input=i;
//					}
//				else {
//					System.out.println("잘못 입력하셨습니다.");//잘못입력했으면 앞으로 돌아가야하는데
//					i--;
//					
//				}
//			}
//			
			System.out.println("컴퓨터는 ["+strrps[rps]+"]를 선택했습니다.");
			
			// 사용자가 입력한 가위바위보 숫자로 변환
			if(inputrps.equals("가위"))
				input=0;
			if(inputrps.equals("바위"))
				input=1;
			if(inputrps.equals("보"))
				input=2;
			
			System.out.println(input +" "+ rps);
			
			if(input==rps){//비교 후 출력
				System.out.println("비겼습니다.");
				mid++;
			}
			else if(input < rps || input==2&&rps==0 ) { 
				System.out.println("졌습니다ㅠㅠ");
				lose++;
			}
			else if(input>rps|| input==0&&rps==2){
				System.out.println("플레이어 승!");
				win++;
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n",win, mid,lose);
				
			
			
			
		}
	}
	
	public void rpsGame_ex() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
		int round=sc.nextInt();// 판수 입력
		
		int win=0,lose=0,draw=0;
		
		
		for(int i=1;i<=round;i++) {
			System.out.println(i+"번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
		
			String player=sc.next();

			int rps=(int)(Math.random()*3);// 랜덤 가위바위보 결정
			
			
			// String s1=null;	- 참조x
			// String s2=""; 	- 빈문자열 
			String com=null;
			switch(rps) {
			case 0:
				com="가위";break;
			case 1:
				com="바위";break;
			case 2: 
				com="보";break;
			}
			
			System.out.println("컴퓨터는 ["+com+"]를 선택했습니다.");
			
			
			if(player.equals(com)) {
					System.out.println("비겼습니다");
				
			}
			else {
				boolean win1=player.equals("가위")&&com.equals("보");
				boolean win2=player.equals("바위")&&com.equals("가위");
				boolean win3=player.equals("보")&&com.equals("바위");
				
				if(win1||win2||win3) {
					System.out.println("플레이어 승!");
					win++;
				}
				else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n",win, draw,lose);
				
		}
	}
}
