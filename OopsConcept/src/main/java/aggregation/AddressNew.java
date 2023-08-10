package aggregation;

public class AddressNew

{
	
	int house_no;
	String house_name;
	String street_name;
	
	
	Student s;       //non primitive datatype created 
	
	AddressNew(int house_no, String house_name, String street_name,Student s)
	{
		
		this.house_no=house_no;
		this.house_name=house_name;
		this.street_name=street_name;
		this.s=s;

	}

	
	void display()
	{
		System.out.println("Name is :" +s.name);
		System.out.println("Roll number is :" +s.rollno);
		System.out.println("House no is :" +house_no);
		System.out.println("House name is :" +house_name);
		System.out.println("Street name is :"+street_name);
	
		
	}
	
	
	public static void main(String[] args) 
	{
		Student s1=new Student("Ann",1);
		AddressNew a1=new AddressNew(201,"Rose Ville","Brigade road ",s1);
		a1.display();

	}

}
