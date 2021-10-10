package com.hsbc.service;

import com.hsbc.beans.Employee;

public interface EmployeeService {
	public void store(Employee employee);
	public Employee findEmployee(int id);
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary);
	public void updateName(int id, String name);
}
