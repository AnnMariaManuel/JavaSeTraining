package inheritance;

public class HierarcyChild1 extends HierarcialParent



{
	
	public void Cat()
	{
		System.out.println("This is a species of parent class which makes the noise  : Meow");
	}
	
	

	public static void main(String[] args) 
	
	{
		HierarcyChild1 hc1 = new HierarcyChild1();
		hc1.Animal();
		hc1.Cat();

	}

}
