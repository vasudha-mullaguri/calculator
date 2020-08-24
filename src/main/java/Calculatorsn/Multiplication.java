package Calculatorsn;

public class Multiplication extends Calculators{
	public void mul(int a[]){
		int mul=1;
		for(int i=0; i<=a.length-1;i++)
		{
			mul=mul*a[i];
		}
		
		System.out.println(mul);	
		}

}
