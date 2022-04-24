package strings_prg;
import java.util.*;
public class Str {

	public static void main(String[] args) {
		String s="Hello";
		String s2="Hello";
	boolean b=(s2==s);//checks the same reference is pointed in string constant pool/literal pool
	s2.concat(" earth");//it will not get appended as the new entry is created in literal pool we have to assing it to some variable 
	String s3=new String("Mayur");//it we be created in the heap memory
	boolean t=s.equals(s2);//checks actual content of string
	System.out.println(s);
	System.out.println(s2);
	System.out.println(s3.concat(" zende"));
	System.out.println(b);
	System.out.println(t);
	
	
	String st=null;
	if(st!=null)
	{
	System.out.println(st.length());
	}
	else 
	{
		System.out.println("it a null string");
	}
	
	System.out.println(s.charAt(2));
	System.out.println(s.codePointAt(2));
	System.out.println(s.contains(s2));
	System.out.println(s.contentEquals(s2));
	System.out.println(s.endsWith("lo"));
	System.out.println(s.hashCode());
	System.out.println(s.lastIndexOf('l'));
	System.out.println(s.lastIndexOf("el"));
	System.out.println(s.indexOf('l',1));
	System.out.println(s.indexOf('l',0));
	System.out.println(s.replace('l', 'L'));
	System.out.println(s.replaceAll("el", "eL"));
	System.out.println(s.toString());
	System.out.println(s.split(":"));
	System.out.println(s.format("*",s.length()));
	System.out.println(s.valueOf(4));
	
}
}