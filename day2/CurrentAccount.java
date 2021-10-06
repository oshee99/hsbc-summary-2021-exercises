package com.hsbc.bean;

public class CurrentAccount extends Account{
	
	private String nomineeName;

	public CurrentAccount(int accountNumber, long balance, int ifsc, String nomineeName) {
		super(accountNumber, balance, ifsc);
		this.nomineeName = nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
	public String diplay() {
		
		String details = super.display() +" "+ nomineeName;
		return details;
	}
}
