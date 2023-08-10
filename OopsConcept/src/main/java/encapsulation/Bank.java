package encapsulation;

public class Bank 

{
	
	private int pin1=123;
	private int pin2=245;
	private String name= "Ann";
	
	
	
	public void getdetail(String username , int userpin)
	{
		
		if (username.equals(name))
			
				{
					if(((userpin==pin1)|(userpin==pin2)))
					{
						System.out.println("Valid credentials");
					}
					else 
					{
						System.out.println("Invalid credentials!!");
					}
					
				}
		
		else
		{
			System.out.println("Username or pin entered is Wrong !! Try again");
		}
	}

}
