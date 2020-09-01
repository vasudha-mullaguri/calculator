package menudriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> input=new ArrayList<Integer>();
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		System.out.println("Enter the elements:");
		while(scan.hasNextInt()){
			input.add(scan.nextInt());
		}
     System.out.println(input);
      for(int i=0;i<=input.size()-1;i++){
    	  int a=input.get(i);
    	  if(a%2==0){
    		  even.add(a);
    		  //System.out.println("the number is even:" +even);
    	  }
    	  else{
    		  odd.add(a);
    		  //System.out.println("the number is odd:"+odd);
    	  }
    	  
    		  
      }
      System.out.println("the number is even:" +even);
	  System.out.println("the number is odd:"+odd);
    	  
      
    	  
	}
	
	

}
