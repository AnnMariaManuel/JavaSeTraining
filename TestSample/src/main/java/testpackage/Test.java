package testpackage;

public class Test {
	
	
	
	static void print()
	{
		
		Sample1 obj2= new Sample1();
		
		System.out.println("Value of instance variable a is :" +obj2.a);
		System.out.println("Value of instance variable b is :" +obj2.b);
		System.out.println("Value of static  variable d is :" +Sample1.d);
		//System.out.println("Value of local variable c is :" +c);--cannot be printed as c is a local variable in method dsplay 
		
	}

	
}
