package superconcept;

public class ChildConstructor extends ParentConstructor

{
	
	ChildConstructor()
	{
		super(4); // for calling parameterized parent constructor from child   
		System.out.println("This is Childclass default constructor");
		
	}
	
	

	public static void main(String[] args)
	
	{
		ChildConstructor cc1= new ChildConstructor(); // will call child constructor and parent class default constructor if any 
		

	}

}
