package com.hsbc.controller;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.service.EmployeeService;

public class ViewController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ObjectFactory factory = new ObjectFactory(); 
		System.out.println("Enter options to create dao 1: Array 2: Array List 3: TreeSet");
		int op = scan.nextInt();
		EmployeeDao dao = factory.getDaoInstance(op);
		EmployeeService service = factory.getServiceInstance(dao);
		
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store employee 2: Find employee by id 3: Find All employees 4: Update Name 5: Update Salary 0: Exit");
			controllerOption = scan.nextInt();
			switch(controllerOption) {
			case 1: 
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
					System.out.println("Successfully stored.....");
					System.out.println("---------------------------------");
				} catch (EmployeeAlreadyExistsException e2) {
					System.err.println(e2.getMessage());
				}
				
				break;
			case 2: 
				System.out.println("-------Enter id to search --------------");
				int id = scan.nextInt();
				try {
					Employee employee = service.findEmployee(id);
					System.out.println("Employee is found.....");
					System.out.println("Hello "+employee.getName()+", your salary is : "+employee.getSalary());
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			case 3: 
				Employee[] employees = service.findAllEmployees();
				for(Employee e : employees) {
					System.out.println("Hello "+e.getName()+", Your salary is: "+e.getSalary()+" and id is : "+e.getId());
				}
				break;
			case 4: 
				System.out.println("Enter Employee ID");
				int empId = scan.nextInt();
				System.out.println("Enter Updated Employee Name");
				String empName = scan.next();
				try {
					service.updateName(empId, empName);
					System.out.println("Updated Successfully!");
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				
				break;
			case 5: 
				System.out.println("Enter Employee ID");
				int emplId = scan.nextInt();
				System.out.println("Enter Updated Employee Salary");
				double empSalary = scan.nextDouble();
				try {
					service.updateSalary(emplId, empSalary);
					System.out.println("Updated Successfully!");
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}
