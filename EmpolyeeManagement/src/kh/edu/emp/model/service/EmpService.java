package kh.edu.emp.model.service;

import java.util.ArrayList;
import java.util.List;
import kh.edu.emp.model.vo.Employee;

public class EmpService {
	
	private List<Employee> empList=new ArrayList<Employee>();
	
	public EmpService() {
		empList.add(new Employee(11,"홍길동", "0000", "aaa@naver.com", "010-0000-0000", "개발부", "차장", 3600));
		empList.add(new Employee(12,"김미영", "0000", "aㅠa@naver.com", "010-0000-0000", "개발부", "차장", 3600));
		empList.add(new Employee(13,"왕왕삥", "0000", "aba@naver.com", "010-0000-0000", "개발부", "차장", 3600));
		empList.add(new Employee(14,"최수연", "0000", "aca@naver.com", "010-0000-0000", "개발부", "차장", 3600));
	}

	public boolean addEmployee(int empId, String empName, String empNum, String empEmail, String empPhone, String empDep,
			String empJobname, int empSal) {
		
		Employee emp=new Employee(empId, empName, empNum, empEmail, empPhone, empDep, empJobname, empSal);
		
		return empList.add(emp);
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

	

}
