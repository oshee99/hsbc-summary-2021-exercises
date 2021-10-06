package com.hsbc.bean;

public class Account {
	private int accountNumber;
	private long balance;
	private int ifsc;
	
	
	public Account(int accountNumber, long balance, int ifsc) {

		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ifsc = ifsc;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	public int getIfsc() {
		return ifsc;
	}


	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	
	public String display() {
		String details = accountNumber +" "+ balance +" "+ ifsc;
		return details;
	}
	
	
}
