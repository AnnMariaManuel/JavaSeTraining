package abstractclass;

import java.util.Scanner;

public class Contracter extends Employee

{
	
	
	public void calculateSalary() 
	
	{
		
		salary=500 * Employee.hrs;
		System.out.println("Salary of contracter employee is: " +salary);
		
	}
	
	public static void main (String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the working hours of contracter employee:");
		hrs=sc.nextInt();
		
		
		Contracter c= new Contracter();
		c.calculateSalary();
		sc.close();
		
		FulltimeEmployee fe=new FulltimeEmployee();
		fe.calculateSalary();
	}

}
