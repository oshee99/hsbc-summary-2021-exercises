package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.dao.util.DBConnection;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		try {
			Connection connection = DBConnection.establishConnection();
			String insertQuery = "insert into employee(name, id, salary) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, employee.getName());
			statement.setInt(2, employee.getId());
			statement.setDouble(3, employee.getSalary());
			statement.executeUpdate();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee employee = null;
		try {
			Connection connection = DBConnection.establishConnection();
			String selectQuery = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employee = new Employee(); // id, name & salary will have default values
				employee.setId(result.getInt(1)); // 1st column value is assigned to id 
				employee.setName(result.getString(2)); // 2nd column is assigned to name
				employee.setSalary(result.getDouble(3)); // 3rd column is assigned to salary
			}
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] employees = null;
		try {
			Connection connection = DBConnection.establishConnection();
			String selectQuery = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			List<Employee> employeesList = new ArrayList<Employee>();
			while(result.next()) {
				Employee employee = new Employee(); // id, name & salary will have default values
				employee.setId(result.getInt(1)); // 1st column value is assigned to id 
				employee.setName(result.getString(2)); // 2nd column is assigned to name
				employee.setSalary(result.getDouble(3)); // 3rd column is assigned to salary
				employeesList.add(employee);
			}
			employees = employeesList.toArray(new Employee[employeesList.size()]);
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = fetchEmployeeById(id);
		if(emp.getId()==id)
			try {
				Connection connection = DBConnection.establishConnection();
				String selectQuery = "update employee set name='?', salary= ? where id = ?";
				PreparedStatement statement = connection.prepareStatement(selectQuery);
				statement.setString(1, employee.getName());
				statement.setDouble(2, employee.getSalary());
				statement.setInt(3, id);
				ResultSet result = statement.executeQuery();
				while(result.next()) {
					employee = new Employee(); // id, name & salary will have default values
					employee.setId(result.getInt(1)); // 1st column value is assigned to id 
					employee.setName(result.getString(2)); // 2nd column is assigned to name
					employee.setSalary(result.getDouble(3)); // 3rd column is assigned to salary
				}
				result.close();
				statement.close();
				connection.close();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		

	}

}
