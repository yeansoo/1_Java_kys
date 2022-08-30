package kh.edu.emp.model.service;

import java.util.ArrayList;
import java.util.List;
import kh.edu.emp.model.vo.Employee;

public class EmpService {
	
	private List<Employee> empList=new ArrayList<Employee>();

	public boolean addEmployee(int empId, String empName, String empNum, String empEmail, String empPhone, String empDep,
			String empJobname, int empSal) {
		
		Employee emp=new Employee(empId, empName, empNum, empEmail, empPhone, empDep, empJobname, empSal);
		
		return empList.add(emp);
	}

	public void showEmp() {
		empList.
		
	}

	

}
