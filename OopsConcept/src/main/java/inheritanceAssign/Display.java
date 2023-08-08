package inheritanceAssign;

public class Display extends Calculation

{
	
	float total ;
	public void total()
	{
		
		total= basic_pay+hra-pf-deduction_amt+bonus;
		System.out.println("SALARY SLIP");
		System.out.println("-------------");
		System.out.println("Basic Pay is :" +basic_pay);
		System.out.println("Deduction is :"+deduction_amt);
		System.out.println("hra is :" +hra);
		System.out.println("PF is:"+pf);
		System.out.println("Bonus is :"+bonus);
		System.out.println("Total salary in hand :"+total);
		
		
	}

	public static void main(String[] args)
	
	{
		
		Display d= new Display();
		d.input();
		d.calc();
		d.total();
	}

}
