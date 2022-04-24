package Collections;
import java.util.*;
public class ClassImplementedDemo {
public static void main(String[] args) {
	
	
	Vector v=new Vector();
	Enumeration e=v.elements();
	Iterator itr=v.iterator();
	ListIterator litr=v.listIterator();
	
	System.out.println(e.getClass().getName());
	System.out.println(itr.getClass().getName());
	System.out.println(litr.getClass().getName());
	
	
	ArrayList al=new ArrayList();
//	Enumeration e1=al.elements(); //enumeration only suspported for leagcy classes 
	Iterator itr1=al.iterator();
	ListIterator litr1=al.listIterator();
	
	//\u000d System.out.println("==========");
	System.out.println(itr1.getClass().getName());
	System.out.println(litr1.getClass().getName());
	
}
}
