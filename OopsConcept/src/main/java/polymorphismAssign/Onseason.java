package polymorphismAssign;

public class Onseason 

{
	
	float  amount;
	float discount;
	
	
	void discount(int total)
	{
		
	
		discount= (40*total)/100;
		amount= total-discount;
		System.out.println("Onseason price is :" +amount);
		
	}

}
