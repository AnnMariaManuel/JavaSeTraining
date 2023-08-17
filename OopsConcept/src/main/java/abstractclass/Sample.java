package abstractclass;

public abstract class Sample 

{
	
	public abstract void show();  //cannot have body for this method as it is abstract
	
	
	public void display()
	{
		System.out.println("This is an instance method in abstract class");
	}

	
	Sample()
	{
		
		System.out.println("This is a default constructor in Parent class");
	}
	
	
	public Sample(int i , int j )
	{
		int k =i+j;
		System.out.println("this is a parametrized constructor in parent class to find sum :" +k);
	}
	
}
