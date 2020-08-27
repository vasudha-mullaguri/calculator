package menudriven;

import java.util.Scanner;

public class Division extends Calculator{
	//the method is used to perform division of numbers
	public void divide(){  
		Scanner input=new Scanner(System.in);
		System.out.println("enter the divisor");
		int divisor=input.nextInt();
		System.out.println("enter the divident");
		int divident=input.nextInt();
		int quiotient;
				
		quiotient=divisor/divident;
		System.out.println(quiotient);
		//while(divisor!=0){
	    //System.out.println("Do you want to continue the division 1.yes\n 2.No");
		//}
		int option=input.nextInt();
		if(option==1)
		{
			System.out.println("enter next divisor");
			int divisor2=input.nextInt();
			divisor=quiotient;
			quiotient=divisor/divisor2;
		}
		else
		{
		  System.out.println(quiotient);	
		}
	}
}
