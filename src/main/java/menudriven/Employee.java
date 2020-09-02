package menudriven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



   public class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private String skills;
	
	Employee(String name, int id, String Skills){
		this.name=name;
		this.id=id;
		this.skills=skills;
	}
	public int compareTo(Employee employeeid) {
	
		return this.id - employeeid.id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
   }
   class NameCompare implements Comparator<Employee> 
   { 
       public int compare(Employee employee1, Employee employee2) 
       { 
           return employee1.getName().compareTo(employee2.getName()); 
       } 
   } 
   class Skillscompare implements Comparator<Employee> 
   { 
       public int compare(Employee employee1, Employee employee2) 
       { 
           return employee1.getSkills().compareTo(employee2.getSkills()); 
       } 
   } 
   
  class Usermain 
  {
	public static void main(String[] args)
	
	{
		ArrayList<Employee> employeevalues=new ArrayList<Employee>();
          employeevalues.add(new Employee("vasudha",1234,"java"));
          employeevalues.add(new Employee("Tom",1232,"corejava"));
          employeevalues.add(new Employee("Meery",1230,"python"));
          
          System.out.println("Sorted by name"); 
          NameCompare nameCompare = new NameCompare(); 
          Collections.sort(employeevalues, nameCompare); 
          for (Employee employee: employeevalues) 
              System.out.println(employee.getName() + " " + employee.getId() + " " +
            		   employee.getSkills()); 
          
          System.out.println("\nSorted by id"); 
          Collections.sort(employeevalues); 
          for (Employee movie: employeevalues) 
             System.out.println(movie.getId() + " " +movie.getSkills() + " " +
                      movie.getName()+" ");
                                    
          System.out.println("Sorted by skills"); 
          Skillscompare skillsCompare = new Skillscompare(); 
          Collections.sort(employeevalues, nameCompare); 
          for (Employee employee: employeevalues) 
              System.out.println(employee.getSkills() + " " + 
            		  employee.getName() + " " + 
            		  employee.getId()); 
    
	
}
  
	
	}
