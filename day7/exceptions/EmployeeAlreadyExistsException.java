package com.hsbc.exceptions;

@SuppressWarnings("serial")
public class EmployeeAlreadyExistsException extends Exception{
	
	public EmployeeAlreadyExistsException() {
		super();
	}
	
	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}
}
