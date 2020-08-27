package menudriven;

public class Division extends Calculator{
	public void div(int a[]){
	    int divisor=a[0];
	    int divident=a[1];
	    int quoitent=1;
		for(int i=0; i<=a.length-1;i++)
		{
			quoitent=divident/divisor;
			divisor=quoitent;
		
		if(i<a.length-2)
		{
			divident=a[i+1];
		}
		
		}
		System.out.println("The division of the numbers is:"+quoitent);	
		}


}
