package Calculatorsn;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		a[i]=input.nextInt();	
		}
		Addition ad=new Addition();
		ad.add(a);
		Substraction subs=new Substraction();
		subs.sub(a);
		Multiplication multi=new Multiplication();
		multi.mul(a);
		Division div=new Division();
		div.div(a);
		
	}
}


