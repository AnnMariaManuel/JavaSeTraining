package testpackage;

public class Sample1 

{
	
	int a= 5; 
	int b=7 ;
	static int d= 9;
	void display()
	{
		
		int c = 11 ; 
		System.out.println("Value of instance variable a is :" +a);
		System.out.println("Value of instance variable b is :" +b);
		System.out.println("Value of static  variable d is :" +d);
		System.out.println("Value of loacal variable c is :" +c);
		
		System.out.println();
		System.out.println();
	}
	
	static void print()
	{
		
		Sample1 obj2= new Sample1();
		
		System.out.println("Value of instance variable a is :" +obj2.a);
		System.out.println("Value of instance variable b is :" +obj2.b);
		System.out.println("Value of static  variable d is :" +d);
		//System.out.println("Value of local variable c is :" +c);--cannot be printed as c is a local variable in method dsplay 
		
	}
	
	public static void main(String[] args) 
	{
		
		Sample1 obj1= new Sample1();
		obj1.display();
		Sample1.print();
	}

}
