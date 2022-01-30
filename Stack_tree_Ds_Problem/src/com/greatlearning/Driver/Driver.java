package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.service.BalancingBrackets;

public class Driver {
	static BalancingBrackets balancingbrackets = new BalancingBrackets();
	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exprargs = "( [ [ { } ] ] ) )";
		try {
			if(BalancingBrackets.areBalancingBrackets(exprargs))
				System.out.println("Balanced String" + exprargs);
			else
				System.out.println("Not Balanced String" + exprargs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
