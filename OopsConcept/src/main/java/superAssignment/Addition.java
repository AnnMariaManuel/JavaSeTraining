package superAssignment;

import java.util.Scanner;

public class Addition

{
	public int sum()
	{	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number : ");
	int i = sc.nextInt();
	System.out.println("Enter second number : ");
	int j = sc.nextInt(); 
	int sum = i +j;
	return sum;
	}

}
