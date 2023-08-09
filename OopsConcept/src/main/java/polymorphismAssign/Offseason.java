package polymorphismAssign;

import java.util.Scanner;

public class Offseason extends Onseason

{
	
	void discount(int total)
	{
		super.discount(total);
		discount= (15*total)/100;
		amount= total-discount;
		System.out.println("Offseason price is :" +amount);
	}
	

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total bill amount");
		int total_amt= sc.nextInt();
		
		Offseason obj=new Offseason();
		obj.discount(total_amt);
		sc.close();

	}

}
