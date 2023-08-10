package aggregation;



public class Address 

{
	int  house_no;
	String house_name;
	String street_name;
	
	Address(int house_no, String house_name, String street_name)
	{
		this.house_no=house_no;
		this.house_name=house_name;
		this.street_name=street_name;
		
	}
	
	void display (String myname , int myrollno)
	{
		
		
		
		
		System.out.println("Name  :" +myname);
		System.out.println("Roll numer  :" +myrollno);
		System.out.println("House number :" +house_no);
		System.out.println("House name :" +house_name);
		System.out.println("Street name :" +street_name);
		
	System.out.println();
	System.out.println("--------------------------------");
	}
		

	
public static void main(String[] args) 
	
	{
		
		Student s1 = new Student("Ann",1);
		Address ad1=new Address(200, "Rose Villa", "MC road");
		ad1.display(s1.name, s1.rollno);
		
		Student s2 = new Student("Emma",2);
		Address ad2=new Address(201, "lilly Villa", "MG road");
		ad2.display(s2.name, s2.rollno);
		
		Student s3 = new Student("tony",3);
		Address ad3=new Address(203, "palm Villa", "MC road");
		ad3.display(s3.name, s3.rollno);
		
		Student s4 = new Student("Anjitha",4);
		Address ad4=new Address(204, "New Mansion", "Brigade road");
		ad4.display(s4.name, s4.rollno);
		
		Student s5 = new Student("Ajal",5);
		Address ad5=new Address(205, "Abram's Villa", "ChurchStreet Road");
		ad5.display(s5.name, s5.rollno);
		
		
		
	}

}
