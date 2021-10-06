package com.hsbc.main;

import com.hsbc.bean.CurrentAccount;
import com.hsbc.bean.SavingsAccount;

public class TestAccounts {
	
	public static void main(String[] args) {
		
		CurrentAccount c1 = new CurrentAccount(10, 25000, 987, "Alex");
		SavingsAccount s1 = new SavingsAccount(100, 30000, 654, 10000);
		
		System.out.println("Savings Account Details: " + s1.diplay());
		System.out.println("Current Account Details: " + c1.diplay());
	}
	
	
}
