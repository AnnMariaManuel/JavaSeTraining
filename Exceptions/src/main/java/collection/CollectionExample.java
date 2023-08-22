package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample 

{

	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();//non-generic ArrayList 
		al.add(1);
		al.add("Ann");
		al.add(2.3f);
		al.add(2);
		al.add(1);
		
		System.out.println("Non -Generic ArrayList is  :" +al);
		
		ArrayList<String> a=new ArrayList();//generic ArrayList
		a.add("Ann");
		a.add("Emma");
		a.add("Tony");
		
		System.out.println("Generic ArrayList is :" +a);
		
		List l= new ArrayList();  //creating reference of list interface non generic
		l.add(1);
		l.add("Ann");
		l.add(2.54f);
		System.out.println("Non generic List is :" +l);
		
		
		List<String> l1=new ArrayList();
		l1.add("Ann");
		l1.add("Teenu");
		l1.add("Maria");
		System.out.println("Generic List is :" +l1);
		
		//set example
		//non generic 
		
		HashSet h=new HashSet();
		h.add(1);
		h.add(2);
		h.add(4);
		System.out.println("Non geenric set is :" +h);
		
		//generic 
		
		HashSet<String> h1=new HashSet();
		h1.add("Ann");
		h1.add("Silvy");
		h1.add("Biju");
		h1.add("Teenu");
		//h1.add(2);--cannot be done as type is string for this set 
		System.out.println(" geenric set is :" +h1);
		
		//creating ref of Set 
		
	    Set s= new HashSet();
	    s.add("Hi");
	    s.add("Hello");
	    s.add("Hiii");
	    System.out.println("Set interface ref set is : " +s);
	    
		
		
		
		
		
	}

}
