package accessmodifiers2;

import accessmodifiers.Access1;

public class Access4 {

	public static void main(String[] args) 
	
	{
		Access1 obj = new Access1();
		obj.publicmethod();//accessible everywhere
		//obj.protectedmethod(); //not accessible , only accessible in othe package during inhertitance 
		//obj.privatemethod();//only in class
		//obj.defaultmethod();//only withinin package 
		

	}

}
