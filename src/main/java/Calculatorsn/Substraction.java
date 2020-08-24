package Calculatorsn;

public class Substraction extends Calculators{
	public void sub(int a[]){
		int sub=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sub=a[i]-sub;
		}
		
		System.out.println("The substraction of numbers is:"+sub);	
		}

}
