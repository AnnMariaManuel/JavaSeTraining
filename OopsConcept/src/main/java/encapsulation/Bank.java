package encapsulation;

public class Bank 

{
	
	private int pin;
	
	public void setdetail(int pin)
	{
		this.pin=pin;
	}
	
	
	public void getdetail()
	{
		
		if((pin==1001)|(pin==1234)|(pin==1212))
			{
			
			System.out.println("Valid ATM PIN Entered..Please Proceed with cash withdrawal!");
		
			}
		
		else
		{
			System.out.println("Invalid PIN entered !!");
		}
		
	}

}
