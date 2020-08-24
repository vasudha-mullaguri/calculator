package menudriven;

public class Multiplication extends Calculator{
	public void multi(int a[]){
		int mulnum=1;
		for(int i=0;i<=a.length-1;i++){
			mulnum=mulnum*a[i];
		}
		System.out.println("The multiplication of the numbers is:"+mulnum);
	}

}
