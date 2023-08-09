package polymorphism;

public class ChildAddition extends ParentAddition

{
	public void display(int i , int j )
	{
		super.display(5, 2);
		int diff = i-j;
		System.out.println("Difference is :" +diff);
		
	}
	
	
	public static void main(String[] args) 
	
	{
		ChildAddition ca= new ChildAddition();
		ca.display(5, 2);
	}

}
