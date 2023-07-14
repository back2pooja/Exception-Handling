package com.pj.exception;

import java.util.Scanner;

public class Calc{
	public static void main(String[] args)throws  NegativeNumberException{
		Scanner scn = new Scanner(System.in);
		Addition a1 = new Addition();
		try {
		System.out.println("Enter First number: ");
		int a = scn.nextInt();
		
		System.out.println("Enter Second number: ");
		int b = scn.nextInt();
		
		int res = a1.add(a,b);
		System.out.println("Result: "+res);
		}
		catch(NegativeNumberException e) {
		System.out.println("Error: "+e.getMessage());
		}
		
	}

}
