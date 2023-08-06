package inheritance;

public class ChildSample extends ParentSample
{
	
	public void print()
	{
		
		System.out.println("This is a child class");
	}

	public static void main(String[] args) 
	{
		
		ChildSample cs= new ChildSample();
		cs.display();
		cs.print();
		

	}

}
