package Aspire;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter another number");
		
		int num2 = scan.nextInt();
		
		int sum= num1+num2;
		
		System.out.println("The sum of number given is .. " +sum);
	}
}
