package inheritanceAssign;

import java.util.Scanner;

public class Employee 
{

int basic_pay;
int deduction_amt;
int bonus;

public void input()

{
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter basic pay :");
	basic_pay= sc.nextInt();
	System.out.println("Enter the decuction amount :");
	deduction_amt=sc.nextInt();
	System.out.println("Enter bonus:");
	bonus=sc.nextInt();
	
	sc.close();
}
}

	

