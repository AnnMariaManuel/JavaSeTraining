package encapsulationnew;

import java.util.Scanner;

import encapsulation.Bank;

public class UserDetails {

	public static void main(String[] args)
	
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user name :");
		String username= sc.next();
		System.out.println("Enter teh ATM PIN :");
		int userpin=sc.nextInt();
		
		Bank obj= new Bank();
		obj.getdetail(username, userpin);
		sc.close();

	}

}
