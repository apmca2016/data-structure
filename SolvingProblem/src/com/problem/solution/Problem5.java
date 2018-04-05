package com.problem.solution;

import java.util.Scanner;

public class Problem5 {

	public static boolean numberOrNot(String input)
	{
		try
		{
			Integer.parseInt(input);
		}catch (NumberFormatException e) {
			
			e.getMessage();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the Mobile Number");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(numberOrNot(input) && input.length() == 10)
		{
			  System.out.println("Good!!! You have entered valid mobile number");
		}
		else
        {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }
	}
}
