package menudriven;

import java.util.Scanner;

public class Addition extends Calculator {
	
	public void add(){
		int size,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=input.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		a[i]=input.nextInt();	
		}
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("The sum of number is:"+sum);	
		}

	
	}


