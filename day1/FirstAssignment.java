package com.example;

public class FirstAssignment {
	static void checkAlphabet(char ch)
	{
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
	            System.out.println(" Alphabet ");
	    else
	            System.out.println(" Not an Alphabet ");
	}
	
	public static void main(String[] args)
	{
		char ch = '*';
	    checkAlphabet(ch);
	}
}
