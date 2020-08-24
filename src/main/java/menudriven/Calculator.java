package menudriven;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int ex;
		int a[];
		int size;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice \n 1.Add \n 2.Sub \n 3.Mul \n 4.div ");
			int option=sc.nextInt();
			if(option!=5)
			{
				System.out.println("enter the size of the array");
				size=sc.nextInt();
				a=new int[size];
				System.out.println("enter the array elements");
				for(int i=0;i<size;i++)
				{
				a[i]=sc.nextInt();	
				}
			}
			else break;
			switch (option)
			{
			case 1:
		          System.out.println("Addition of two numbers");
			      Addition ad=new Addition();
			      ad.add(a);
		          break;
			case 2:
				  System.out.println("Substraction of two numbers");
			      Substraction subs=new Substraction();
			      subs.sub(a);
		          break;
			case 3:
				System.out.println("Multiplication of two numbers");
			      Multiplication mult=new Multiplication();
			      mult.multi(a);
		          break;  
			case 4:
				System.out.println("Division of two numbers");
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue? 1.yes 2.No");
			 ex=sc.nextInt();
		}while(ex==1);
	}

	

}
			
		

	
	
	
