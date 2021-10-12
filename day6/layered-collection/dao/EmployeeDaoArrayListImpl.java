package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;


public class EmployeeDaoArrayListImpl implements EmployeeDao {

	private static List<Employee> employeesList = new ArrayList<Employee>();

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		employeesList.add(employee); 
		
	}
	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = null;
		for(Employee e : employeesList) {
			if(e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	@Override
	public Employee[] findAllEmployees() {
		Employee[] empArray = employeesList.toArray(new Employee[employeesList.size()]);
		return empArray;
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
