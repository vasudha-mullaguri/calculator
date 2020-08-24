package menudriven;

public class Substraction extends Calculator{
	public void sub(int a[]){
		int subnum=0;
		for(int i=0;i<=a.length-1;i++){
			subnum=a[i]-subnum;
		}
		System.out.println("The substraction of numbers is:"+subnum);
	}
	

}
