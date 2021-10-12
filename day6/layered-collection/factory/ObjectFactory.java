package com.hsbc.factory;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.dao.EmployeeDaoArrayListImpl;
import com.hsbc.dao.EmployeeDaoTreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;


public class ObjectFactory {
	private EmployeeDao dao;
	
	public EmployeeDao getDaoInstance(int op) {
		switch(op) {
		case 1: 
			dao = new EmployeeDaoArrayImpl();
			break;
		case 2: 
			dao = new EmployeeDaoArrayListImpl();
			break;
		case 3:
			dao = new EmployeeDaoTreeSetImpl();
			break;
			
	}
	if(dao == null) {
		dao = new EmployeeDaoArrayImpl();
	}
	return dao;
	}
	
	public EmployeeService getServiceInstance(EmployeeDao dao) {
		return new EmployeeServiceImpl(dao);
	}

}
