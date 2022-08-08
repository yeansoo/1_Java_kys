package edu.kh.op.practice;


import java.util.Scanner;


public class OperatorPractice4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("국어 : ");
			int kor=sc.nextInt();
		
			System.out.print("영어 : ");
			int eng=sc.nextInt();
			
			System.out.print("수학 : ");
			int math=sc.nextInt();
			
			int total=kor+eng+math;
			System.out.println("합계 : "+total);
			
			double aver=total/3.0;
			System.out.printf("평균 : %.1f\n",aver);
			
			String result=(kor>=40&&eng>=40&&math>=40)&&aver>=60?"합격":"불합격";
			System.out.println(result);
			
			
		}
}
