package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	public void store(Employee employee) throws EmployeeAlreadyExistsException;
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary)throws EmployeeNotFoundException;
	public void updateName(int id, String name)throws EmployeeNotFoundException;
}
