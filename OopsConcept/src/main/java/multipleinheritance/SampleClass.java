package multipleinheritance;

public class SampleClass implements TestInterface1,TestInterface2

{

	

	@Override
	public void display() 
	{
		System.out.println("This is a abstract method in interface 2");
	}

	@Override
	public void show() 
	{
		System.out.println("This is a abstract method in interface 1");
		
	}
	
	public static void main(String[] args)
	{
		// calling the interface abstract methods 
		
		/*SampleClass sc=new SampleClass();
		sc.display();
		sc.show();*/
		
		TestInterface1 t=new SampleClass();
		t.show();
		//t.display(); 
		//cannot be called as object is created for interface 1, so method of interface 2 cannot be accessed here

	}

}
