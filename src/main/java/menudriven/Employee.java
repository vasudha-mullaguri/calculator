package menudriven;

import java.util.ArrayList;
import java.util.Iterator;



public class Employee {
	String name;
	int id;
	String skills;
	Employee(String name,int id,String skills){
		this.name=name;
		this.id=id;
		this.skills=skills;
	}
   
	public static void main(String[] args) {
		Employee employee1=new Employee("Tom",1234,"QA");
		Employee employee2=new Employee("Jerry",1235,"Admin");
		Employee employee3=new Employee("vasudha",1236,"QA");
		
		ArrayList<Employee> employeevalues=new ArrayList<Employee>();
          employeevalues.add(employee1);
          employeevalues.add(employee2);
          employeevalues.add(employee3);
           Iterator <Employee> iteratorvalues=employeevalues.iterator();
           while(iteratorvalues.hasNext()){
        	   Employee values=iteratorvalues.next();
        	   System.out.println(values.name);
        	  System.out.println(values.id);
        	   System.out.println(values.skills);
           }
}
}