package accessmodifiers;

public class Access1 

{
	
	public int i;
	private  int j;
	protected int k;
	int l;
	
	public void publicmethod()
	{
		System.out.println(i);
		
	}
	
	/*private void privatemethod()
	{
		System.out.println(j);
	}*/
	
	protected void protectedmethod()
	{
		System.out.println(k);
	}
	
	void defaultmethod()
	{
		
		System.out.println(l);
		System.out.println("This is a default method added");
	
	}
	

	/*public static void main(String args[]) 
	
	{
		Access1 ob= new Access1();
		ob.privatemethod();
		ob.protectedmethod();
		ob.publicmethod();
		ob.defaultmethod();

	}*/

}
