package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MethodCollections 
{

	public static void main(String[] args) 
	
	{
		ArrayList<String>al=new ArrayList();
		al.add("Ann");
		al.add("Teenu");
		al.add("Emma");
		al.add("Tony");
		System.out.println("The arraylist is :" +al);
		System.out.println("The size of arraylist is :" + al.size());//size of array
		
		//to remove an element from the arraylist 
		
		al.remove(1);
		System.out.println("Updated array list after removing is " + al);
		System.out.println("The size of arraylist is :" + al.size());
		
		//to add all elements of a collection to another collection 
		
		ArrayList<String> a2=new ArrayList();
		System.out.println("Collection a2 is:" +a2); 
		
		a2.addAll(al);
		System.out.println("Collection a2 after adding all elements from al arraylist is :" +a2);
		
		//iterator interface 
		
		
		
		
		
		//to remove all emelents 
		
		a2.removeAll(a2);
		System.out.println("Collection a2 after removing all elements is :" +a2);
		
		//to check if an elemt is already present in list we use contains which has a return type is boolean 
		
		boolean b= al.contains("Ann");
		System.out.println("element is prenent in list ?" +b);
		
		boolean b1= al.contains("Chinnu");
		System.out.println("element is prenent in list ?" +b1);
		
		al.add("Chinnu");
		System.out.println("After adding non duplicate eleemt list al is :" +al);
		
		
		//to retreive any one element from the list 
		
		System.out.println("The element in 3rd index of  arraylist is :" +al.get(3));
		
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext()) //checks if data is there in 1st position 
		{
			System.out.println("The list a1 is"+itr.next());//prints 1st element and points  to position 2 
		}
		
		
		itr.remove();//last object is removed in this case 
		System.out.println("The updated al list is :" +al);
		
	}

}
