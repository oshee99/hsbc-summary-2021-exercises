package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.factory.ObjectFactory;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
	public EmployeeServiceImpl() {
		
		ObjectFactory factory = new ObjectFactory();
		dao = factory.getDaoInstance();
	}

	@Override
	public void store(Employee employee) throws EmployeeAlreadyExistsException{
		Employee[] e = dao.findAllEmployees();
		for(Employee emp:e) {
			if(emp.getId() == employee.getId())
			{
				throw new EmployeeAlreadyExistsException("Sorry employee with an id "+employee.getId()+" already exists.");
			}
		}
		dao.save(employee);
	}
		

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		emp.setSalary(salary);
		dao.updateEmployee(id, emp);
	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException{
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		emp.setName(name);
		dao.updateEmployee(id, emp);
	}

}
