package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
		public void practice1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input=sc.nextInt();
			if(input<=0) {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}else {
				for(int i=1;i<=input;i++)
				System.out.print(i+" ");
			}
		}
		
		public void practice2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input=sc.nextInt();
			if(input<=0) {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}else {
				for(int i=input;i>=1;i--)
				System.out.print(i+" ");
			}
		}
		
		public void practice3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 하나 입력하세요 : ");
			int input=sc.nextInt();
			int sum=0;
			
			for(int i=1;i<=input;i++) {
				if(i!=input)
					System.out.print(i+" + ");
				else
					System.out.print(i+" = ");
				sum+=i;
			}
			System.out.println(sum);
		}
		
		public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자 : ");
			int input1=sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int input2=sc.nextInt();
			
			if(input1<=0 ||input2<=0 ) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			else {
				/* 풀어주신 방법
				 * if(input1<input2)
				 * for(int i=input1;input1<=input2;input1++)
				 * 
				 * else
				 * for(int i=input2;input2<=input2;input2++)
				 * 
				 * 
				 * int start=input1;
				 * int end=input2;
				 * 
				 * if(input1>input2)
				 * start=input2;
				 * end=input1;
				 * 
				 */
				if(input1<input2) {//만약 두번째 숫자가 첫번째숫자보다 크다면
					int temp=input2;
					input2=input1;
					input1=temp;
				}
				
				for(int i=input2;i<=input1;i++) {
					System.out.print(i+" ");
				}
			}
	
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int input=sc.nextInt();
			System.out.println("===== "+input+"단 =====");
			for(int i=1;i<10;i++)
				System.out.println(input+ " * "+i+" = "+(input*i));
		}
		
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int input=sc.nextInt();
			if(input>=2 && input<=9  ) {
				for(int j=input;j<10;j++) {
				System.out.println("===== "+j+"단 =====");
				for(int i=1;i<10;i++)
					System.out.println(j+ " * "+i+" = "+(j*i));
				}
			}
			else {
				System.out.println("2~9 사이 숫자만 입력해주세요.");
			}
		}
		
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			for(int i=0;i<input;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			for(int i=0;i<input;i++) {
				for(int j=input;j>i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void practice9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
		/*
		 * for(int row=1;row<=input;row++){
		 * 	for(int col=1;col<=row;col++){
		 * 	
		 * 	}
		 * }
		 */
			for(int i=0;i<input;i++) {

//				for(int j=input-1;j>=0;j--) {
//					if(j<=i)
//						System.out.print("*");
//					else
//						System.out.print(" ");
//				}
				
				
				for(int j=input-1;j>i;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}

		}
		
		public void practice10() {// 코드 줄이기 가능한가
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
//			for(int i=0;i<input;i++) {
//				for(int j=0;j<=i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			for(int i=0;i<input-1;i++) {
//				for(int j=input-1;j>i;j--) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
			for(int i=0;i<input*2-1;i++) {//줄 수
				if(i<input) {
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				else {
					for(int j=input*2-1;j>i;j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		
		public void practice10_1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
			// 위쪽 삼각형
			for(int row=1;row<=input;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//아래쪽 삼각형
			for(int row=input-1;row>=1;row--) {
				for(int col=1;col<=row;col++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		}

		public void practice11() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
			// for문을 이용한 풀이
//			for(int i=1;i<=input;i++) {// 줄 수
//				for(int j=input;j>i;j--) { // 출력 되는 공백의 수
//					System.out.print(" ");
//				}
//				for(int l=1;l<=i*2-1;l++)// 출력 되는 별의 수
//					System.out.print("*");
//				System.out.println();
//			}
			
			// if문을 이용한 풀이
			for(int row=1;row<=input;row++) {//줄수
				for(int col=1;col<=input*2-1;col++) {//열수
					if(input-row>=col||input+row<=col) {
						System.out.print(" ");
					}
					else{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}
		
		public void practice12() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
			for(int i=0;i<input;i++) {
				for(int j=0;j<input;j++) {
					if(i==0||i==input-1||j==0||j==input-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
		}
		
		public void practice13() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("자연수 하나를 입력하세요 : ");
			int input=sc.nextInt();
			int count=0;
			for(int i=1;i<=input;i++) {
				if(i%2==0 || i%3==0)
					System.out.print(i +" ");
				if(i%2==0 && i%3==0)
					count++;
			}
			System.out.println("\ncount : "+count);
		}
		
}
