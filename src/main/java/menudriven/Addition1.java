package menudriven;

import java.util.ArrayList;
import java.util.Scanner;

public class Addition1 {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,c;
		ArrayList<Integer> user_input=new ArrayList<Integer>();
		System.out.println("Enter the number of data");
		Scanner num_data=new Scanner(System.in);
		int num = num_data.nextInt();

		for(int i=0; i<=num; i++){
		System.out.println("Enter the input");
		Scanner input=new Scanner(System.in);
		int data =input.nextInt();
		user_input.add(data);
		System.out.println(user_input);
		}
		//System.out.println(user_input);
		for(int i=0; i<=user_input.size()-1;i++)
		{
			
			 c = user_input.get(i); 
			 sum=sum+c; 
			 System.out.println(sum);//add the numbers and store in sum
		}
	
    
	}
}
