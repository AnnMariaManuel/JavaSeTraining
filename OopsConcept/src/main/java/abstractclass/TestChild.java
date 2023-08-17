package abstractclass;

public class TestChild extends Sample

{
	TestChild()
	{
		System.out.println("This is child class constructor ");
	}
	
	
	TestChild(int i , int j )
	{
		int l=i+j;
		System.out.println("Sum is :" +l);
	}
	
	public void show()
	{
		System.out.println("This is the implememtation of abstract method show ");
	}

	public static void main(String[] args)
	
	{
		TestChild tc=new TestChild();
		TestChild tc1= new TestChild(1,2);
		//tc.show();
		//tc.display();
		//TestChild tc1=new Sample(2,3);
		
		
		

	}

}
