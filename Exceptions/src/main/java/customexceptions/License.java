package customexceptions;

public class License 

{
	
	void age(int a) throws LicenseException
	{
		if(a<=18)
		{
			throw new LicenseException("Not Eligible");
		}
		
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException 
	
	{
		License l= new License();
		try
		{
		l.age(14);
		}
		catch (LicenseException le)
		{
			System.out.println(le);
		}
		System.out.println("Statement after exception code ");

	}

}
