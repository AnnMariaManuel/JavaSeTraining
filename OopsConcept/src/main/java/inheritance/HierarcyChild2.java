package inheritance;

public class HierarcyChild2 extends HierarcialParent
{
	
	public void Dog()
	{
		System.out.println("This is a species of parent class which makes the noise  : Bark");
	}

	public static void main(String[] args) 
	
	{
		
		HierarcyChild2 hc2=new HierarcyChild2();
		hc2.Animal();
		hc2.Dog();
	}

}
