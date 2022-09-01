package kh.edu.emp.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kh.edu.emp.model.service.EmpService;
import kh.edu.emp.model.vo.Employee;

/*
 * 	private int empId; // 사원 번호(사번)
	private String empName; // 사원 이름
	private String empNo; // 주민등록번호
	private String email; // 이메일
	private String phone; // 전화번호
	private String departmentTitle; // 부서명
	private String jobName; // 직급명
	private int salary; // 급여
	
 */

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
			case 6: selectDep(); break;
			case 7: selectOverSal(); break;
			case 8: selectSalSum(); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
			
		}while(input!=0);
		
	}
	
	// 프린트하는 구문을 새로 만들자!

	

	

	

	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 */
	private void delempNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[사번이 일치하는 사원 정보 삭제]");
		
		System.out.print("사번 입력 > ");
		int input=sc.nextInt();
		
		if(service.delEmpId(input)==null)
			System.out.println("일치하는 사원이 없습니다");
		else
			System.out.println(service.delEmpId(input));
		
		// 일치하는 사원이 있는경우 사원 리턴, 아닌경우 null 리턴
	}
	
	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 */
	private void editempNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		
		System.out.print("사번 입력 > ");
		int input=sc.nextInt();
		
		System.out.print("이름 : ");
		String empName=sc.next();
		
		System.out.print("이메일 : ");
		String Email=sc.next();
		
		System.out.print("전화번호 : ");
		String empPhone=sc.next();
		
		System.out.print("부서명 : ");
		String depName=sc.next();
		
		System.out.print("직급명 : ");
		String workName=sc.next();
		
		System.out.print("급여 : ");
		int sal=sc.nextInt();
		
		service.editempNum(input,empName, Email,empPhone, depName, workName);
		
		
	}

	/**
	 * 3. 사번이 일치하는 사원 조회 
	 * 사번이 일치하지 않는 경우 구현해야함
	 */
	private void selectempNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		
		System.out.print("사번 입력 > ");
		int input=sc.nextInt();
		
		System.out.print("");
		service.selectempNum(input);
	}

	/**
	 * 2. 전체 사원 정보 조회
	 */
	private void showEmp() {
		System.out.println("[전체 사원 정보 조회]");
		
		List<Employee> empList=service.getEmpList();
		
		service.printList(empList);
	}

	/**
	 * 1. 사원 추가
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
	
	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	private void selectDep() {
		Scanner sc = new Scanner(System.in);
		List<Employee> tmp=new ArrayList<Employee>();
		System.out.println("[입력 받은 부서와 일치 모든 사원 정보 조회]");
		
		System.out.print("부서 입력 > ");
		String input=sc.next();
		
		tmp=service.selectDep(input);
		
		if(tmp==null)
			System.out.println("잘못된 입력입니다.");
		else 
			service.printList(tmp);
	}
	
	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	private void selectOverSal() {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> tmp=new ArrayList<Employee>();
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		
		System.out.print("급여 입력 > ");
		int input=sc.nextInt();
		
		tmp=service.selectOverSal(input);
		
		if(tmp==null) {
			System.out.println("조회된 사원이 없습니다.");
		}else
			service.printList(tmp);
	}
	
	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	private void selectSalSum() {
		
		System.out.println("[부서별 급여 합 전체 조회]");
				
		service.selectSalSum();
		
	}
	
}
