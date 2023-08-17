package encapsulationnew;

import java.util.Scanner;

import encapsulation.Bank;

public class UserDetails {

	public static void main(String[] args)
	
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your ATM PIN Number :");
		int userpin=sc.nextInt();
		
		Bank b= new Bank();
		b.setdetail(userpin);
		b.getdetail();
		
		sc.close();

	}

}
