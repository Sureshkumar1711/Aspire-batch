package practice1;

import java.util.Scanner;

public class ComputeElectricityBill {

	public static void main(String[] args) {
		
				long units;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of Units");
		
		units = sc.nextLong();
		
		double billpay= 0;
		
		if (units<=100)
			
			billpay = units*0;
		
		else if (units<=200)

			billpay = 100*0+(units-100)*1.5;
		
		else if (units<=500)
			
			
			billpay = 100*0+ 100 *2+(units-200)*3;
		
		else if (units>500)
			
			billpay = 100*0 + 100*3.5 + 300*4.6 + (units-500)*6.6;
		
		
		System.out.println("Bill to pay : " +billpay);
		
		
	}
}



