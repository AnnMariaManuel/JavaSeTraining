package accessmodifiers2;

import accessmodifiers.Access1;

public class Access3 extends Access1
{

	public static void main(String[] args)
	{
		Access3 obj= new Access3();
		obj.publicmethod();
		//obj.privatemethod();// not accessible
		obj.protectedmethod();
		//obj.defaultmethod(); //not accessible , default is accessible in same package only , 

	}

}
