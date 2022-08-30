package kh.edu.emp.view;

import java.util.Scanner;

import kh.edu.emp.model.service.EmpService;
import kh.edu.emp.model.vo.Employee;

public class EmpView {

	EmpService service=new EmpService();
	
	public void empRun() {
		
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.println("[사원관리 프로그램]");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("입력 > ");
			input=sc.nextInt();
			
			switch(input) {
			case 1: addEmp(); break;
			case 2: showEmp(); break;
			case 3: selectempNum(); break;
			case 4: editempNum(); break;
			case 5: delempNum(); break;
			case 6: selectempDep(); break;
			case 7: selectempSal(); break;
			case 8: selectSalSum(); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(input!=0);
		
	}

	private void selectSalSum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		
	}

	private void selectempSal() {
		// TODO Auto-generated method stub
		
	}

	private void delempNum() {
		// TODO Auto-generated method stub
		
	}

	private void selectempDep() {
		// TODO Auto-generated method stub
		
	}

	private void editempNum() {
		// TODO Auto-generated method stub
		
	}

	private void selectempNum() {
		// TODO Auto-generated method stub
		
	}

	private void showEmp() {
		System.out.println("[전체 사원 정보 조회]");
		
		service.showEmp();
	}

	/**
	 * 사원 추가
	 */
	public void addEmp() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[새로운 사원 정보 추가]");
		
		System.out.print("사원 번호(사번) : ");
		int empId=sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String empName=sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNum=sc.next();
		
		System.out.print("이메일 : ");
		String empEmail=sc.next();
		
		System.out.print("전화번호 : ");
		String empPhone=sc.next();
		
		System.out.print("부서명 : ");
		String empDep=sc.next();
		
		System.out.print("직급명 : ");
		String empJobname=sc.next();
		
		System.out.print("급여 : ");
		int empSal=sc.nextInt();
		
		if(service.addEmployee(empId, empName, empNum, empEmail, empPhone, empDep, empJobname, empSal)) {
			System.out.println("사원 추가 완료");
		}else {
			System.out.println("사원 추가 실패");
		}
	}
}
