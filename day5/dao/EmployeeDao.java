package com.hsbc.dao;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public interface EmployeeDao {
	public void save(Employee employee) throws EmployeeAlreadyExistsException;
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateEmployee(int id, Employee employee);
}
