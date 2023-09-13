package exceptionPgms;

public class NullpointerException {

	public static void main(String[] args) 
	
	{
		String s=null;
		try
		{
	    int len= s.length();
	    System.out.println("Length of string is :" +len);
		}
		catch(NullPointerException ne)
		{
			System.out.println("Exception description is " +ne);
		}
		finally
		{
			System.out.println("Unable to get teh length");
		}
		
		
	    
	}

}
