package superconcept;

public class ParentClass 

{

 int i =7; 
 int j=8 ; 
 
 public void add()
 {
	 
	 int sum = i +j ;
	 System.out.println("Sum is :" +sum);
	 this.multiply();
 }
 
 public void multiply()
 {
	 int mult= i * j;
	 System.out.println("Multiply is " +mult);
 }
}
