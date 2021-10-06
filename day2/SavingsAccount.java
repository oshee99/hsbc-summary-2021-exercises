package com.hsbc.bean;

public class SavingsAccount extends Account{
	
	private long dailyLimit;

	public SavingsAccount(int accountNumber, long balance, int ifsc, long dailyLimit) {
		super(accountNumber, balance, ifsc);
		this.dailyLimit = dailyLimit;
	}

	public long getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(long dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
	public String diplay() {
		
		String details = super.display() +" "+ dailyLimit;
		return details;
	}
}
