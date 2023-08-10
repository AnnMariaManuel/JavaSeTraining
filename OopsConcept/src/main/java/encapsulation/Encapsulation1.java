package encapsulation;

public class Encapsulation1

{
	
	private int age;
	private String name ;
	
	
	
	public void setmethod(int age , String name ) 

		{
			this.age=age;
			this.name=name;
		}
	
	public void getmethod()
	{
		
		System.out.println("Name is :" +name);
		age=age*2;
		System.out.println("Age is :" +age);
	}
}
