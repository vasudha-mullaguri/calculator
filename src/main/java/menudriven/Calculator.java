package menudriven;

import java.util.Scanner;

public class Calculator {
	//The method for selecting for addition or substraction or multiplication or division or expression 
	public void menuDriven(){

		int exponent;
		Scanner input=new Scanner(System.in);
		do
		{
			try {
			
			System.out.println("enter your choice \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.division \n 5.Expression");
			int option=input.nextInt();
			switch (option)
			{
			case 1:
			      Addition addition=new Addition();
			      addition.add();
			      addition.collections();
		          break;
			case 2:
			      Substraction subs=new Substraction();
			      subs.substract();
		          break;
			case 3:
			      Multiplication multiplication=new Multiplication();
			      multiplication.multi();
		          break;  
			case 4:
				Division division=new Division();
				division.divide();
				break;
			case 5:
				Expression expression=new Expression();
				System.out.println(expression.evaluate());
				
				break;
			}
			}
			catch(Exception e) {
				System.out.println("Invalid Choice,try again");
			}
			finally {
			System.out.println("Do you want to continue? 1.yes 2.No");
			 exponent=input.nextInt();
			}
			}while(exponent==1);
	
	}

}
			
		

	
	
		

	
	
	
