package Calculatorsn;

public class Addition extends Calculators{
	
	public void add(int a[]){
		int sum=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("The sum of the number is:"+sum);	
		}
	}


