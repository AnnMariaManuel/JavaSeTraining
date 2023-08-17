package interfaceprograms;

public class TestClass implements Test1

{


	@Override
	public void display() 
	{
		System.out.println("This is interface method 1: display");
		//y=40; --cannot be done as y is final 
	}

	@Override
	public void show() 
	{
		
		System.out.println("This is interface method 2: show");
	}

	
	public void classmethod() 
	{
		
		System.out.println("This is a method belonging to this class");
	}
	

	public static void main(String[] args) 
	
	{
		//create ref of implemented class and calling abstract methods in interface and class methods
		
		TestClass tc=new TestClass();
		tc.show();
		tc.display();
		tc.classmethod();

	}
}
