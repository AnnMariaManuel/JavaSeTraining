package abstractclass;



public class FulltimeEmployee extends Employee
{

	
	
	


	@Override
	public void calculateSalary() 
	
	{
		salary= daily_hrs*600;
		System.out.println("Salary of fulltime employee is: " +salary);
	}

	
	
}
