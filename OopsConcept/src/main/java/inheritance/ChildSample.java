package inheritance;

public class ChildSample extends ParentSample
{
	
	public void print()
	{
		System.out.println(a);
		System.out.println("This is a child class modified now");
	}

	public static void main(String[] args) 
	{
		
		ChildSample cs= new ChildSample();
		cs.display();
		cs.print();
		

	}

}

