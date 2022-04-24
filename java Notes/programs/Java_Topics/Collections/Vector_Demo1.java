package Collections;
import java.util.*;
public class Vector_Demo1 {
public static void main(String[] args) {
	
	Vector v=new Vector();//if we doe(10,3) then extra only 3 memory will be added to it.
	
	System.out.println("capcity is="+v.capacity());
	
	for(int i=1;i<=10;i++)
	{
		v.addElement(i);
	}
	
	v.add("A");
	System.out.println(v.capacity());
	
	System.out.println(v);
	
	System.out.println("capcity is="+v.capacity());
	
}
}
