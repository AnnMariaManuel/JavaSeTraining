package polymorphism;

public class Childoverride extends ParentOverride

{
	
	void print()
	{
		System.out.println("This is child class method");
		super.print();
	}

	public static void main(String[] args)
	
	{
		
		Childoverride co=new Childoverride();
		co.print();
	}

}
