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
		for(int index = 0; index < arrayIndexCounter; index++) {
			if(id == employeeDb[index].getId()) {
				return employeeDb[index];
			}
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
	public void updateEmployee(int id, Employee employee) {
		Employee e = fetchEmployeeById(id);
		if(e.getId()==id)
		{
			e = employee;
		}
	}
}
