package com.example.springRestApi.mySpringApp;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	ArrayList<Employee> newEmployee = new ArrayList<> ();
	
	// View Employee List
	@GetMapping("/getEmployees")
	public ArrayList<Employee> getEmployees() {
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Daniel");
		emp1.setLastName("Johnson");
		emp1.setEmpId(001);
		emp1.setPosition("Engineer");
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Michael");
		emp2.setLastName("Jefferson");
		emp2.setEmpId(002);
		emp2.setPosition("Designer");
		
		Employee emp3 = new Employee();
		emp3.setFirstName("Hashraf");
		emp3.setLastName("Hakimi");
		emp3.setEmpId(003);
		emp3.setPosition("Footballer");
		
		Employee emp4 = new Employee();
		emp4.setFirstName("Luke");
		emp4.setLastName("Shaw");
		emp4.setEmpId(004);
		emp4.setPosition("Analyst");
		
		Employee emp5 = new Employee();
		emp5.setFirstName("Anthony");
		emp5.setLastName("Martial");
		emp5.setEmpId(005);
		emp5.setPosition("Scout");
		
		Employee emp6 = new Employee();
		emp6.setFirstName("Daniel");
		emp6.setLastName("Johnson");
		emp6.setEmpId(006);
		emp6.setPosition("Engineer");
		
		ArrayList<Employee> employee = new ArrayList<> ();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		employee.add(emp6);
		
		return employee;
	}
		//Add Employee
		@PostMapping("/addEmployee")
		public String addEmployee (@RequestBody Employee employee) {
			String result;
		if (newEmployee.contains(employee)) {
			result = "Employee already exists";
		}else {
			newEmployee.add(employee);
			result = "Employee added";
		}
			return result;
		}
		
		
	//Update Employee
	@PutMapping("/updateEmployee")
	public String updateEmployee(Employee employee) {		
		String result;
		if (newEmployee.contains(employee)) {
			 newEmployee.set(0, employee);
			 result = "Employee Updated";
		} else {
			result = "Employee doesn't exist";
		}
		
		return result;	
       
    }
		
	

	// Delete Employee
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(Employee employee) {
		
		String result;
		if (newEmployee.contains(employee)) {
			 newEmployee.remove(0);
			 result = "Employee Removed";
		} else {
			result = "Employee doesn't exist";
		}
		
		return result;	
		
	}


}
