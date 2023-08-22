package exceptionPgms;

public class ArithmeticExceptionEg

{
  
	public void calc()
	{
		
		int a= 6; 
		
		try //to hit exception 
		
		{
		int b= a/0;
	  System.out.println("Value of b is " +b);
		}
		
		catch(NullPointerException ne)// to handle exception hit in try 
		{
			System.out.println("Nullpointer exception");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Arrayindexoutof bound exception");
		}
		catch(Exception e )
		{
			System.out.println("Exception class executed");
		}
		/*catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
		}*/
		
		
		
		/*finally //if not handled , use finally to execute next main code 
		{
			System.out.println("Finally block ");
		}*/
		
	}
	
	
	public static void main(String[] args)
	{
		ArithmeticExceptionEg uc= new ArithmeticExceptionEg();
		System.out.println("Before method call");//will be executed as this code is before exception 
		uc.calc();
		System.out.println("End of method call ");//will not be executed as previous code line has exception 
      
	}

}
