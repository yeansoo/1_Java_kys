package edu.kh.oop.method.run;

import java.util.Scanner;

import edu.kh.oop.method.view.MethodExampleView;

// 실행용 클래스

public class MethodExampeRun {
	public static void main(String[] args) {
		
		// 클래스 내 어디서든 사용 가능한 Scanner객체 생성
		//(캡슐화 원칙에 따라서 rpivate)
		Scanner sc = new Scanner(System.in);
		
		// MethodExampleView객체 생성
		MethodExampleView view=new MethodExampleView();
		
		view.displayMenu();
		// view가 참조하는 객체의 기능(메서드) 중 
		// displayMenu() 메서드를 호출
	}
}
