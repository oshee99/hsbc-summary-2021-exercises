package com.hsbc.factory;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;


public class ObjectFactory {
	
	public EmployeeDao getDaoInstance() {
		return new EmployeeDaoArrayImpl();
	}
	
	public EmployeeService getServiceInstance() {
		return new EmployeeServiceImpl();
	}

}
