package menudriven;

import java.util.Scanner;

public class Substraction extends Calculator{
	//The method is used to perform subtraction of numbers
	public void substract(){
		int size,subnumber=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=input.nextInt();
		if(size<=0)
			throw new ArithmeticException("Array size must be atleast one");
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		a[i]=input.nextInt();	
		}
		try {
		for(int i=0;i<=a.length-1;i++){
			subnumber=a[i]-subnumber;
		}
		System.out.println("The substraction of numbers is:"+subnumber);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index out ofbound");
	}
	
	}
}
