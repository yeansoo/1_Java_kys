package kh.edu.emp.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
public class EmpService {
	
	private List<Employee> empList=new ArrayList<Employee>();
	
	public EmpService() {
		empList.add(new Employee(11,"홍길동", "980616-0000000", "raura98@naver.com", "010-0000-0000", "개발부", "차장", 3600));
		empList.add(new Employee(12,"김미영", "980616-0000000", "axa@naver.com", "010-0000-0000", "영업부", "차장", 3800));
		empList.add(new Employee(13,"왕왕삥", "980616-0000000", "aba@naver.com", "010-0000-0000", "개발부", "차장", 3000));
		empList.add(new Employee(14,"최수연", "980616-0000000", "aca@naver.com", "010-0000-0000", "인사부", "차장", 4000));
		empList.add(new Employee(15,"최연연", "980616-0000000", "aca@naver.com", "010-0000-0000", "인사부" , "차장", 4000));
		empList.add(new Employee(16,"김수연", "980616-0000000", "aca@naver.com", "010-0000-0000","영업부", "차장", 7000));
	}

	public boolean addEmployee(int empId, String empName, String empNum, String empEmail, String empPhone, String empDep,
			String empJobname, int empSal) {
		
		Employee emp=new Employee(empId, empName, empNum, empEmail, empPhone, empDep, empJobname, empSal);
		
		return empList.add(emp);
	}
	
	public void printList(List<Employee> list) {
		System.out.println("| 사번 |   이름   |  주민등록번호   |        이메일        |     전화번호     |   부서명   |  직급명  |  급여  |");
		
		for(Employee e:list) {
			System.out.printf("| %3d  | %4s  | %15s | %-20s |  %13s   |  %4s   | %4s   |  %4d  |\n",
					e.getEmpId(),e.getEmpName(), e.getEmpNo(),e.getEmail(),e.getPhone(),e.getDepartmentTitle(), e.getJobName(), e.getSalary());
		}
	}


	public List getEmpList() {
		return empList;
	}
	
	public void showEmp() {
		for(Employee e:empList) {
			System.out.println(e);
		}
		
	}

	public void selectempNum(int input) {
		
		for(Employee e: empList) {
			if(e.getEmpId()==input)
				System.out.println(e);
		}
		
	}

	
	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 */
	public void editempNum(int input, String empName, String email, String empPhone, String depName, String workName) {
		
		for(Employee e: empList) {
			if(e.getEmpId()==input) {
				e.setEmpName(empName);
				e.setEmail(email);
				e.setPhone(empPhone);
				e.setDepartmentTitle(depName);
				e.setJobName(workName);
			}	
		}
	}
	
	
	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 */
	public Object delEmpId(int input) {
		Employee tmp=new Employee(input, null, null, null, null, null, null, input);
		for(Employee e: empList) {
			if(e.getEmpId()==input) {
				empList.remove();
				return ;
				
			}
			
		}
		return null;
	}

	

	
	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public List<Employee> selectDep(String input) {
		
		List<Employee> out=new ArrayList<Employee>();
		for(Employee e:empList) {
			if(e.getDepartmentTitle().equals(input))
				out.add(e);
		}
		
		if(out.isEmpty())
			return null;
		else 
			return out;
	}
	
	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public List<Employee> selectOverSal(int input) {
		List<Employee> out=new ArrayList<Employee>();
		for(Employee e:empList) {
			if(e.getSalary()>input)
				out.add(e);
		}
		
		if(out.isEmpty())
			return null;
		else
			return out;
	}

	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	public void selectSalSum() {
		List<String> temp=new ArrayList<String>();
		for(Employee e:empList) {
			if(!temp.contains(e.getDepartmentTitle()))// temp에 없을때만 추가
				temp.add(e.getDepartmentTitle());
		}//부서가 없는 경우는 어떻게/???
		

		 for(String dep:temp){
			int sum=0;
			
			for(Employee e:empList) {
			
				if(e.getDepartmentTitle().equals(dep))
					sum+=e.getSalary();
			}
			
				System.out.println(dep + "급여 합 : "+sum);
		}
		
	}

	
}
