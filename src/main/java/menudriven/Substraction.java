package menudriven;

import java.util.Scanner;

public class Substraction extends Calculator{
	//the method is used to perform subtraction of numbers
	public void sub(){
		int size,subnum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=input.nextInt();
		if(size<0)
			throw new ArithmeticException("Array size must be atleast one");
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		a[i]=input.nextInt();	
		}
		try {
		for(int i=0;i<=a.length-1;i++){
			subnum=a[i]-subnum;
		}
		System.out.println("The substraction of numbers is:"+subnum);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index out ofbound");
	}
	
	}
}
