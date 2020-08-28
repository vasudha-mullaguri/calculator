package menudriven;

import java.util.Scanner;

public class Multiplication extends Calculator{
	//the method is used to perform multiplication of numbers
	public void multi() throws ArrayIndexOutOfBoundsException{
		int size,mulnum=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array"); 
		size=input.nextInt(); 
		if(size<0)
			throw new ArithmeticException("Array size must be atleast one");
		int[] a=new int[size];
		
		for(int i=0;i<size;i++)  
		{
		a[i]=input.nextInt();	
		}
		try {
		for(int i=0;i<=a.length-1;i++){
			mulnum=mulnum*a[i];
		}
		System.out.println("The multiplication of the numbers is:"+mulnum);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index out ofbound");
	}
}

}