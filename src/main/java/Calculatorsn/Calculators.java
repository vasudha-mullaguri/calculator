package Calculatorsn;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		a[i]=sc.nextInt();	
		}
		Addition ad=new Addition();
		ad.add(a);
		Substraction subs=new Substraction();
		subs.sub(a);
		Multiplication multi=new Multiplication();
		multi.mul(a);
		
	}
}


