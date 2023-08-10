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
	
	
	
	public static void main(String[] args) 
	{
		
	Test.print();

	}

}
