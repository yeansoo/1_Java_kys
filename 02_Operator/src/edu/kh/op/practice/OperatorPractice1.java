package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("인원 수 : ");
			int peopleNum=sc.nextInt();
			
			System.out.print("사탕 개수 : ");
			int candyNum=sc.nextInt();
			
			int personCandy=candyNum/peopleNum;
			int restCandy=candyNum%peopleNum;
			
			System.out.println("1인당 사탕 개수 : "+personCandy);
			System.out.println("남은 사탕 개수 : "+ restCandy);
			
			
			
		}
}
