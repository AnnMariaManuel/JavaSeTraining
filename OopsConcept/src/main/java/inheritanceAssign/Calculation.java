package inheritanceAssign;

public class Calculation extends Employee

{
	float hra; 
	float pf;
	
	public void calc()
	{
		 
		hra= (5*basic_pay)/100;
		pf=(20*basic_pay)/100;
		
	}

}
