package superAssignment;

public class Checking extends Addition 

{
	
	public void check ()
	{
		int result = super.sum();
		if (result%10==0)
		{
			System.out.println("Sum is divisible by 10 ");
		}
		else 
			System.out.println("Sum is not divisible by 10 ");
		
	}

	public static void main(String[] args) 
	
	{
		Checking c= new Checking();
		c.check();

	}

}
