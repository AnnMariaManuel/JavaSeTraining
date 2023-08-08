package superconcept;

public class ChildClass extends ParentClass

{
	int i = 5; 
	int j =2;
	
	void print()
	{
		
		
		System.out.println("Value of i and j is : " +i + "and " +j);
		
		System.out.println("value of i and j from parent class is " +super.i + "and " +super.j);
		
		//calling parent method from child
		super.add();
		this.sub();
		
	}
	
	void sub()
	{
		
		int diff = i-j;
		System.out.println("Difference is :" +diff);
	}
	
	

	public static void main(String[] args) 
	
	{
		ChildClass cc= new ChildClass();
		//cc.add();
		cc.print();

	}

}
