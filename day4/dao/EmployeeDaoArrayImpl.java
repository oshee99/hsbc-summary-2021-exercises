package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;
	
	@Override
	public void save(Employee employee) {
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}
	@Override
	public Employee fetchEmployeeById(int id) {
		for(Employee emp:employeeDb)
		{
			if(emp.getId()==id)
				return(emp);
		}
		return null;
	}
	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	@Override
	public void updateEmployeeName(int id, String name) {
		Employee [] tempAr = findAllEmployees();
		for(Employee emp:tempAr)
		{
			if(emp.getId()==id)
			{
				emp.setName(name);
			}
		}
	}
	@Override
	public void updateEmployeeSalary(int id, double salary) {
		Employee [] tempAr = findAllEmployees();
		for(Employee emp:tempAr)
		{
			if(emp.getId()==id)
			{
				emp.setSalary(salary);;
			}
		}
	}
	
}
