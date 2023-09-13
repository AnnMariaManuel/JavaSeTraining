package exceptionPgms;

public class ArrayException {

	public static void main(String[] args) 
	
	{
		int a[]= {1,2,3,4,5};
		try
		{
		System.out.println("The 6th element in array is :" +a[5]);
		}
		catch(Exception are)
		{
			System.out.println("Exception description is :" +are);
		}

	}

}
