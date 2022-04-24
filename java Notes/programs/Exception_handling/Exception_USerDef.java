package Exceptions_prg;
import java.util.*;
public class Exception_USerDef {
public static void main(String[] args) {
	int age=Integer.parseInt(args[0]);
	
	
	//Us_Exception us=new Us_Exception(age);
	try {
	if(validage(age))
	System.out.println("age is valid");
	
	}
	catch(Us_Exception ag) 
	{
		System.out.println("age is invlaid");
		ag.printStackTrace();
	}

}
static boolean validage(int a) throws Us_Exception
{
	if(!(a>=1 && a <=100))
	{
		throw new Us_Exception();
	}
	
	return true;
}
}
class Us_Exception extends Exception{
	int age=0;
	public Us_Exception() {
		// TODO Auto-generated constructor stub
	}
	Us_Exception(int a)
	{
		age=a;
	}
	public String AgeInvalid()
	{
		return "Age is Invalid= "+this.age;
	}

}
