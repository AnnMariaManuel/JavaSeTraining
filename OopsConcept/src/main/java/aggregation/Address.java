package aggregation;



public class Address 

{
	int  house_no;
	String house_name;
	String street_name;
	
	void addressdetails(int house_no, String house_name, String street_name)
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
		

		
		/*Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the house number ");
		house_no=sc1.nextInt();
		System.out.println("Enter the house_name");
		house_name=sc1.next();
		System.out.println("Enter the street name");
		street_name=sc1.next();
		sc1.close();*/
	

	public static void main(String[] args) 
	
	{
		
		Student s1 = new Student();
		s1.Student_details("Ann", 1);
		Address ad1=new Address();
		ad1.addressdetails(200, "Rose Villa", "MC road");
	    ad1.display(s1.name, s1.rollno);
		
		
		
		Student s2 = new Student();
		s2.Student_details("Anjitha", 2);
		Address ad2=new Address();
		ad2.addressdetails(201, "Krishna Villa", "New road");
		ad2.display(s2.name, s2.rollno);
		
		
		Student s3 = new Student();
		s3.Student_details("Ajal", 3);
		Address ad3=new Address();
		ad3.addressdetails(203, "TreeTops Villa", "MG road ");
		ad3.display(s3.name, s3.rollno);
		

		
	}

}
