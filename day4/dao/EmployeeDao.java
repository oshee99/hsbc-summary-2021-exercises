package com.hsbc.dao;

import com.hsbc.beans.Employee;

public interface EmployeeDao {
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateEmployeeName(int id, String name);
	public void updateEmployeeSalary(int id, double salary);
}
