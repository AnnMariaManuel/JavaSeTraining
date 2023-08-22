package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionAssgnmt {

	public static void main(String[] args) 
	
	{
		
		//creating a Arraylist of colors 
		ArrayList<String>a1=new ArrayList();
		a1.add("Yellow");
		a1.add("Pink");
		a1.add("Blue");
		a1.add("Black");
		a1.add("Lavendar");
		
		
		System.out.println("The collection of colors is :" +a1);

		
			//retreive an elemnt from a particuar position 
		
		System.out.println("The element in 2nd position is :" +a1.get(2));
		
		Iterator itr=a1.iterator();
		System.out.println("The list a1 is:");
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
		//remove 3rd element from array list 
		a1.remove(3);
		System.out.println("After removing 3rd element :" +a1);
		
		
		//search for an element
		
		boolean b = a1.contains("Red");
		
		if(b)
		{
			System.out.println("After searching for an element : Element found !!");
		}
		else 
			System.out.println("After searching for an element : Element not found...!!! ");
	}

}
