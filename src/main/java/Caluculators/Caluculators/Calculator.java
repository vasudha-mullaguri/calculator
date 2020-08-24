package Caluculators.Caluculators;

import java.util.Scanner;

public class Calculator 
{
	
    public static void main( String[] args )
    {
    	Scanner reader=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("enter the two numbers");
        num1=reader.nextInt();
        num2=reader.nextInt();
        num3=reader.nextInt();
    	Addition addresult=new Addition();
    	int total1=addresult.add(num1,num2);
    	System.out.println("The sum of two number is:"+total1);
    	int totalsum=addresult.add(num1,num2,num3);
    	System.out.println("The sum of three numbers is:"+totalsum);
    	Substraction subresult=new Substraction();
    	int total2=subresult.sub(num1,num2);
    	System.out.println("The substraction of two number is:"+total2);
    	Multiplication mulresult=new Multiplication();
    	int total3=mulresult.mul(num1,num2);
    	System.out.println("The multiplication of two number is:"+total3);
    	Division divresult=new Division();
    	int total4=divresult.div(num1,num2);
    	System.out.println("The division of two number is:"+total4);
    }
}
