package menudriven;

import java.util.Scanner;

public class Division extends Calculator{
	//the method is used to perform division of numbers
	public void divide(){  
		Scanner input=new Scanner(System.in);
		System.out.println("enter the divisor");
		int divisor=input.nextInt();
		System.out.println("enter the divident");
		int dividend=input.nextInt();
		int quotient;
		if(divisor==0)
			throw new ArithmeticException("division cannot be performed");		
		quotient=dividend/divisor;
		System.out.println(quotient);
		while(dividend!=0){
	    System.out.println("Do you want to continue the division 1.yes\n 2.No");
		}
		int option=input.nextInt();
		if(option==1)
		{
			System.out.println("enter next divisor");
			int divisor2=input.nextInt();
			divisor=quotient;
			quotient=divisor/divisor2;
		}
		else
		{
		  System.out.println(quotient);	
		}
	}
}
