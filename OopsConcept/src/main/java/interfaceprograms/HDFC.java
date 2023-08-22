package interfaceprograms;

//import java.util.Scanner;

public class HDFC implements RBI
{

	//static int deposit_amt;
	//static int deposit_tenure;

	@Override
	public void recurringDeposit(int deposit_amt,int deposit_tenure ) 
	{
		float maturity_amt=  deposit_amt + ((deposit_amt*interest_rate*deposit_tenure)/100);
		System.out.println("Maturity amount is :" +maturity_amt);
		
	}
	
public static void main(String[] args) 
	
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposit Amount :");
		deposit_amt= sc.nextInt();
		System.out.println("Enter deposit tenure:");
		deposit_tenure=sc.nextInt();
		sc.close();*/
		
		HDFC h= new HDFC();
		h.recurringDeposit(10000,3);
		

	}

}
