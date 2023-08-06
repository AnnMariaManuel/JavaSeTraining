package inheritance;

public class MultiInheritanceC extends MultiInheritanceB

{
	
	public void view()
	{
		
		System.out.println("This is class C ");
	}

	public static void main(String[] args) 
	
	{
		MultiInheritanceC mc1=new MultiInheritanceC();
		mc1.display();
		mc1.print();
		mc1.view();

	}

}
