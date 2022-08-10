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
		
		public void practice11() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			
			for(int i=0;i<input;i++) {// 줄 수
				for(int j=input-1;j>i;j--) {
					System.out.print(" ");
				}
				for(int l=0;l<(i+1)*2-1;l++)
					System.out.print("*");
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
