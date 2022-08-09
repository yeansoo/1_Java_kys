package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
		public void practice1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자를 한 개 입력하세요 : ");
			int input=sc.nextInt();
			
			if(input<=0) {
				System.out.println("양수만 입력해주세요.");
			}
			else 
			{
				if(input%2==0)
					System.out.println("짝수입니다.");
				else
					System.out.println("홀수입니다.");
			}
		}
		
		public void practice2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어점수 : ");
			int kor=sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math=sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng=sc.nextInt();
			
			int sum=kor+math+eng;
			double avg=sum/3.0;
			
			if((kor>=40 &&eng>=40&&math>=40)&&avg>=60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",kor,math,eng,sum,avg);
			}
			else {
				System.out.println("불합격입니다.");
			}			
		}
		
		
		public void practice3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1~12 사이이 정수 입력 : ");
			int month=sc.nextInt();
			int date;
			
			switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				date=31; break;
			case 4:case 6:case 9:case 11:
				date=30; break;
			case 2:
				date=28; break;
				default:
					date=-1;
			}
			
			if(date==-1)
				System.out.println(month+"월은 잘못 입력된 달입니다.");
			else
				System.out.println(month+"월은 "+date+"일까지 있습니다. ");
			
		}
		
		public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("키(m)를 입력해 주세요 : ");
			double height=sc.nextDouble();
			
			System.out.print("몸무게(kg)을 입력해 주세요 : ");
			double weight=sc.nextDouble();
			
			double bmi=weight/(height*height);
			
			System.out.println("BMI 지수 : "+bmi);
			
			if(bmi<18.5)
				System.out.println("저체중");
			else if(bmi<23)
				System.out.println("정상체중");
			else if(bmi<25)
				System.out.println("과체중");
			else if(bmi<23)
				System.out.println("비만");
			else
				System.out.println("고도 비만");
		}
		
		public void practice5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("중간 고사 점수 : ");
			double mid=sc.nextInt()*0.2;
			
			System.out.print("기말 고사 점수 : ");
			double last=sc.nextInt()*0.3;
			
			System.out.print("과제 점수 : ");
			double hw=sc.nextInt()*0.3;
			
			System.out.print("출석 횟수 : ");
			int attend=sc.nextInt();
			
			double sum=mid+last+hw+attend;
			System.out.println("================= 결과 =================");
			
			if(((20-attend)/20.0)>=0.3) { // 강의횟수 20회 30% 이상 결석시 Fail
				System.out.println("Fail [출석 횟수 부족 ("+attend+"/20)]");
			}
			else {
				System.out.println("중간 고사 점수(20) : "+ mid);
				System.out.println("기말 고사 점수(30) : "+ last);
				System.out.println("과제 점수	(20) : "+ hw);
				System.out.println("출석 점수 	(20) : "+ attend*1.0);
				System.out.println("총점 : "+ sum);
				if(sum<70)
					System.out.println("FAIL [점수 미달]");
				else 
					System.out.println("PASS");
			}
			
		}
}
