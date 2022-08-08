package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name=sc.next();
			
			// sc.next() : 한 단어 입력, 띄어쓰기 미포함
			// sc.nextLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
			
			System.out.print("학년(정수) : ");
			int grade=sc.nextInt();
			
			System.out.print("반(정수) : ");
			int classNum=sc.nextInt();
			
			System.out.print("번호(정수) : ");
			int num=sc.nextInt();
			
			sc.nextLine(); // 입력버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
			
			System.out.print("성별(남학생/여학생):");
			String gen=sc.nextLine();
			
			// 버퍼 맨 앞에 남은 엔터를 꺼내옴
			// -> 문자열을 입력하지 못하고 넘어감
			
			// ** 해결 방법 **
			// 입력버퍼 맨 앞에 있는 엔터(개행문자)를 제거
			
			// 맨 앞에 엔터(개행문자)가 남은 경우
			// -> next(), nextInt(), nextFloat(), nextDouble() 등...
			//	nextLine()을 제외한 모두
			//	뒤에 sc.nextLine()을 한 번 더 작성하기
			
			
			System.out.print("성적(소수점 아래 둘째 자리까지) : ");
			double score=sc.nextDouble();
			
			System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. ",grade,classNum,num,name,gen,score);
			
			
		}
}
