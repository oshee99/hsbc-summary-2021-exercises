package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoTreeSetImpl implements EmployeeDao{
	
	private static Set<Employee> employeeSet = new TreeSet<Employee>();
	

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		employeeSet.add(employee);
		
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = null;
		for(Employee e : employeeSet) {
			if(e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] empArray = employeeSet.toArray(new Employee[employeeSet.size()]);
		return empArray;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee e = fetchEmployeeById(id);
		if(e.getId()==id)
		{
			e = employee;
		}
	}

}
